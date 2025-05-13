package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> hashMap=new HashMap<>();

        Stack<Integer> stack=new Stack<>();

        for(int number:nums2){
           while(!stack.isEmpty()&&stack.peek()<number){
               hashMap.put(stack.pop(),number);
           }
            stack.push(number);
        }

        for(int i=0;i< nums1.length;i++){

            nums1[i]=hashMap.getOrDefault(nums1[i],-1);

        }

        Arrays.stream(nums1).forEach(System.out::println);

        return nums1;
    }
    public static void main(String[] args){

    // int[]  nums1 = {4,1,2};
    // int[]  nums2 = {1,3,4,2};

     /* int[]  nums1 = {2,4};
         int[]  nums2 = {1,2,3,4};*/
        int[]  nums1={1,3,5,2,4};
        int[]  nums2={6,5,4,3,2,1,7};

      NextGreaterElement496 nextGreaterElement=new NextGreaterElement496();

        nextGreaterElement.nextGreaterElement(nums1,nums2);
    }
}
