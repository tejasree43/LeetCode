package Medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf238 {

    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        Arrays.fill(answer,1);

        int n= nums.length;
        int current =1;
        for(int i=0;i<nums.length;i++)
        {
            answer[i] *= current;
            current *= nums[i];
        }

         current =1;

        System.out.println(n-1);
       for(int j=n-1;j>=0;j--){
           answer[j] *= current;
           current *= nums[j];
        }

        return answer;
    }
    public static void main(String[] args){

        ProductofArrayExceptSelf238 product = new ProductofArrayExceptSelf238();
        int[] nums = {1,2,3,4};
        int[] output = product.productExceptSelf(nums);
        Arrays.stream(output).forEach(System.out::println);
    }
}
