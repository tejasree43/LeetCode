package Hard;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleinHistogram84 {

    public int largestRectangleArea(int[] heights) {

       Stack<Integer> stack=new Stack<>();
       int[] left=new int[heights.length];
       int[] right=new int[heights.length];

        for(int i=0;i<heights.length;i++){

           while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]) {
               stack.pop();
           }

               if(stack.isEmpty()) {
                   left[i]=0;
               }
               else{
                   left[i]=stack.peek()+1;
               }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            stack.pop();
        }
        for(int i=heights.length-1;i>=0;i--){

            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                right[i]=heights.length-1;
            }
            else{
                right[i]=stack.peek()-1;
            }
            stack.push(i);
        }

        Arrays.stream(left).forEach(System.out::print);
        Arrays.stream(right).forEach(System.out::println);
        int ans=0;
        int max=0;
        for(int i=0;i<heights.length;i++){

        max=heights[i]*(right[i]-left[i]+1);
       ans= Math.max(ans,max);

        }


        return ans;
    }

    public static void main(String[] args){

        int [] heights = {2,1,5,6,2,3};
        LargestRectangleinHistogram84 largestRectangle=new LargestRectangleinHistogram84();
       int output=  largestRectangle.largestRectangleArea(heights);
       System.out.println("output"+output);
    }
}
