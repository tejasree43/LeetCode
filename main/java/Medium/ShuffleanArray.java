package Medium;

import java.util.Random;

public class ShuffleanArray {

    int [] originalArray =null;
    int [] shuffleArray =null;
    int [] res =null;

    public ShuffleanArray(int[] nums) {
        res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[i];
        }
        originalArray = nums;
        shuffleArray = nums;
    }

    public int[] reset() {

        return shuffleArray;
    }

    public int[] shuffle() {

        Random rand = new Random();

    for(int i =0;i<res.length;i++){

        int j = rand.nextInt(res.length);
        int temp = res[i];
        res[i] = res[j];
        res[j] = temp;
    }
    return res;
    }

    public static void main(String[] args){

        int[] nums ={1, 2, 3};
        ShuffleanArray obj = new  ShuffleanArray(nums);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();

        for(int number:param_1){
            System.out.println(number);
        }
        System.out.print("-----------------");

        for(int number1:param_2){
            System.out.println(number1);
        }

    }
}
