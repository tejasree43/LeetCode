package Medium;

import java.util.*;

public class TopKFrequentWords692 {

    public List<String> topKFrequent(String[] words, int k) {

        /*HashMap<String,Integer> hMap = new HashMap<>();
        for(String word:words){

            hMap.put(word,hMap.getOrDefault(word,0)+1);
        }

        List<String> list = new ArrayList<>(hMap.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String e1, String e2) {

                if(hMap.get(e2)==hMap.get(e1)){
                    return e1.compareTo(e2);
                }
                return hMap.get(e2)-hMap.get(e1);
            }
        });

        System.out.println(list);

        return list.subList(0,k);*/

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>((x, y) -> {
            if (wordCount.get(x) == wordCount.get(y)) {
                return y.compareTo(x);
            }
            return wordCount.get(x) - wordCount.get(y);
        });

        for(String word : wordCount.keySet()) {
            minHeap.add(word);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        LinkedList<String> result = new LinkedList<>();

        while(!minHeap.isEmpty()) {
            result.addFirst(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args){

        String[]  words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        TopKFrequentWords692 frequent = new TopKFrequentWords692();
        List<String> list =frequent.topKFrequent( words,  k);
        System.out.println(list);
    }
}
