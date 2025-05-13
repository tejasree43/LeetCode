package Easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static int[] twoSum(int[] nums , int target) {

        //Array solution

        //Time Complexity:O(n^2)
        //The time complexity of this program is O(n^2), where n is the length of the input array nums.
        // The outer loop iterates through the array from index 0 to n-1, and the inner loop iterates through the remaining elements from index i+1 to n-1.
        // This results in a nested loop that checks all possible pairs of numbers. Therefore, the overall time complexity is quadratic,
        // proportional to the square of the size of the input array.
        //Space Complexity :O(1)
      /*  for (int i = 0; i < nums.length ; i++) {
            for (int j =i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};*/

        //Time Complexity:
        //The time complexity of this program is O(n), where n is the length of the input array nums.
        // The for loop iterates through the array once,
        // performing constant-time operations in each iteration. The operations inside the loop,
        // such as checking for complement in the map using containsKey() and retrieving its value using get(),
        // are expected to have an average time complexity of O(1) for a HashMap. Therefore, the overall time complexity is linear,
        // proportional to the size of the input array.

        //Space Complexity:
        //The space complexity of this program is O(n), where n is the length of the input array nums.
        // The HashMap map stores the elements from the input array as key-value pairs. In the worst case,
        // where there are no two numbers adding up to the target, the HashMap may store all the elements from the input array.
        // Hence, the space complexity is linear, proportional to the size of the input array.
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};



    }

    public static void main(String args[]) {
    int[] input={3,2,4};
    int target=6;
       int[] output = TwoSum1.twoSum(input,target);
        Arrays.stream(output).forEach(System.out::println);

    }
    }

