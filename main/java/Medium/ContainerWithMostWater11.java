package Medium;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {

       // Brute Force approach
        /*  int n = nums.length;
        int startHeight = nums[0];
        int endHeight = nums[n-1];

            int j;
            for (j = n; j < 0; j--) {
                if (endHeight > nums[j]) {
                    break;
                }
                endHeight = Math.max(endHeight, nums[j]);
            }

            int i;

        for (i = 0; i < n; i++) {

            if (startHeight >=endHeight) {
                break;
            }
            startHeight = Math.max(startHeight, nums[i]);
        }

        System.out.println("endHeight"+endHeight);
        System.out.println("startHeight"+startHeight);
        int totalWater = 0;
        totalWater = Math.max(startHeight, (j - i) * endHeight);

        return totalWater;*/

       //Two pointer approach
       //Time complexity:O(n)
       //Time complexity:O(1)
        int i = 0;
        int j = height.length-1;
       // int result = Math.min(height[i],height[j])*(j-i);
        int maxArea = 0;
        while(i<j)
        {

            if(height[i]<=height[j])
            {
               i++;
            }
            else{
                j--;
            }
            int length = j-i;
            int width  = Math.min(height[i],height[j]);
            // maxArea = Math.min(height[i],height[j]) * (j-i);
            //maxArea=Math.min(height[i],height[j])*(j-i);
            maxArea = Math.max(maxArea,length*width);
        }
        return maxArea;
    }

    public static void main(String[] args)
    {

       int[] nums={1,8,6,2,5,4,8,3,7};

       //int[] nums={1,1};
       //int[] nums={1,2,1};
       //int[] nums={2,3,4,5,18,17,6};

        ContainerWithMostWater11 cwmw = new ContainerWithMostWater11();
        int output= cwmw.maxArea(nums);
        System.out.println("previousMaxSum"+output);

    }
}

/*
Example 1:
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the
        max area of water (blue section) the container can contain is 49.
*/
