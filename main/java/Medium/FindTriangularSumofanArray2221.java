package Medium;

import Easy.MinMaxGame2293;

public class FindTriangularSumofanArray2221 {

    public int triangularSum(int[] nums) {

        int n = nums.length;
        int[] numsArray= new int[n-1];

        if(n==1){
            return nums[0];
        }
        for(int i =0;i<n-1;i++){

                numsArray[i] = Math.addExact(nums[i],nums[i+1]) % 10;
        }

        return triangularSum(numsArray);

    }

    public static void main(String[] args) {

        FindTriangularSumofanArray2221 triangular = new  FindTriangularSumofanArray2221();
        int n[] = {1,2,3,4,5};
        int result = triangular.triangularSum(n);
        System.out.println("triangular result"+result);

    }
}
