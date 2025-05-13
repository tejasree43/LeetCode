package Medium;

public class LongestSubArrayAfter1delete1493 {
    public int longestSubarray(int[] nums) {

        int i = 0;
        int j = 0;
        int countZeros = 0;
        int k = 1;
        int result = 0;

        while (i < nums.length) {

            if (nums[i] == 0) {
                countZeros++;
            }

            while (countZeros > k) {
                if (nums[j] == 0) {
                    countZeros--;
                }
                j++;

            }
            result= Math.max(result, i - j );
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
     int[]  nums = {1,1,0,1};
     LongestSubArrayAfter1delete1493 longest = new LongestSubArrayAfter1delete1493();
      int result = longest.longestSubarray(nums);
      System.out.println("result"+result);

    }
}