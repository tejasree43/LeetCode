package Easy;

import java.util.*;

public class IntersectionofTwoArrays350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> setNumbers = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                setNumbers.add(nums2[j]);
                i++;
                j++;
            }

        }
        int[] result = setNumbers.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
       IntersectionofTwoArrays350 inter = new IntersectionofTwoArrays350();
        int[] output =inter.intersect(nums1,nums2);
       Arrays.stream(output).forEach(s->System.out.println(s));
    }
}


/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]*/
