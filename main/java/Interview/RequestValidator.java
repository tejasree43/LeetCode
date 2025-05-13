package Interview;

import java.time.Instant;
import java.util.*;

public class RequestValidator {
    private static final int MAX_REQUESTS = 2;
    private static final int REQUEST_WINDOW_SECONDS = 5;

    public static List<Integer> validateRequests(List<String> blacklistedIps, List<String> requests) {
        List<Integer> blockedIndices = new ArrayList<>();
        Map<String, Deque<Instant>> requestHistory = new HashMap<>();

        for (int i = 0; i < requests.size(); i++) {
            String request = requests.get(i);
            String ipAddress = extractIPAddress(request);

            if (isIPBlacklisted(ipAddress, blacklistedIps)) {
                blockedIndices.add(1);
            } else if (isRequestLimitExceeded(ipAddress, requestHistory)) {
                blockedIndices.add(1);
            } else {
                addToRequestHistory(ipAddress, requestHistory);
                blockedIndices.add(0);
            }
        }

        return blockedIndices;
    }

    private static String extractIPAddress(String request) {
        return request.trim();
    }

    private static boolean isIPBlacklisted(String ipAddress, List<String> blacklistedIps) {
        for (String regex : blacklistedIps) {
            if (ipAddress.matches(regex)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRequestLimitExceeded(String ipAddress, Map<String, Deque<Instant>> requestHistory) {
        Deque<Instant> history = requestHistory.getOrDefault(ipAddress, new ArrayDeque<>());
        Instant now = Instant.now();
        Instant windowStart = now.minusSeconds(REQUEST_WINDOW_SECONDS);
        history.removeIf(timestamp -> timestamp.isBefore(windowStart));
        history.addLast(now);
        requestHistory.put(ipAddress, history);
        return history.size() > MAX_REQUESTS;
    }

    private static void addToRequestHistory(String ipAddress, Map<String, Deque<Instant>> requestHistory) {
        Deque<Instant> history = requestHistory.getOrDefault(ipAddress, new ArrayDeque<>());
        history.addLast(Instant.now());
        requestHistory.put(ipAddress, history);
    }

    public static void main(String[] args) {
        List<String> blacklistedIps = Arrays.asList("111.*", "123.*", "34.**");
        List<String> requests = Arrays.asList(
                "123.1.23.34",
                "121.1.23.34",
                "121.1.23.34",
                "34.1.23.34",
                "121.1.23.34",
                "12.1.23.34",
                "112.23.34"
        );

        List<Integer> results = validateRequests(blacklistedIps, requests);
        System.out.println(results);
    }
}