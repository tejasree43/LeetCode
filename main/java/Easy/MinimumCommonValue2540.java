package Easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumCommonValue2540 {

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int minimumCommonValue = Integer.MAX_VALUE;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {

                minimumCommonValue = Math.max(minimumCommonValue,nums1[i]);
                i++;
                j++;
            }

        }
        return minimumCommonValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        IntersectionofTwoArrays350 inter = new IntersectionofTwoArrays350();
        int[] output = inter.intersect(nums1, nums2);
        Arrays.stream(output).forEach(s -> System.out.println(s));
    }
}