package Easy;

import java.util.HashSet;
import java.util.Hashtable;

public class UniqueNumberofOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {

        Hashtable<Integer, Integer> hm = new Hashtable();
        for (int element : arr) {
            int value = hm.getOrDefault(element, 0) + 1;
            hm.put(element, value);
          }

            HashSet<Integer> set = new HashSet<>(hm.values());

            if (hm.size() == set.size()) {
                return true;
            }
            return false;
        }

public static void main(String[] args) {
    UniqueNumberofOccurrences1207 unique = new UniqueNumberofOccurrences1207();
    int[] arr = {1,2,2,1,1,3};
    boolean output = unique.uniqueOccurrences(arr);
    System.out.println("output"+output);

}


    }

