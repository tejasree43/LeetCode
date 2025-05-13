package Hard;

public class LargestHistogramBruteForce {

    public int largestRectangleArea(int[] heights) {


        int left=0;
        int  right =0;
        int max=0;

        int ans=0;
        for(int i = 0; i<heights.length; i++)
        {

            for(int j=i;j<heights.length;j++) {

                if(heights[j]>=heights[i]) {
                    left++;
                }
                else {
                    break;
                }

            }
            for(int k=i;k>=0;k--) {

                if(heights[k]>=heights[i]) {
                    right++;
                }
                else {
                    break;
                }

            }

              max=heights[i]*(left+right-1);
              ans=Math.max(max,ans);
              right =0;
              left=0;
            }


        return ans;
    }

        public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        LargestHistogramBruteForce largestRect = new LargestHistogramBruteForce();
        int output = largestRect.largestRectangleArea(heights);
        System.out.println("output" + output);
    }
}
