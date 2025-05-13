package Interview;

public class LuckyNumber {

    public int findLucky(int[] nums) {

        int maxNumber = 0;
        int count = 1;
        int i = 0;
        while (i < nums.length) {
          int  j=i;
            count=1;
            while (j+1< nums.length&&nums[i]==nums[j+1]) {
                    count++;
                    j++;

            }
                maxNumber = Math.max(count, maxNumber);
                i++;
        }

        return maxNumber!=1?maxNumber:-1;

    }
    public static void main(String[] args) {

     // int[] nums ={1,2,2,3,3,3} ;
        int[] nums ={2,3,5} ;

        LuckyNumber luck = new LuckyNumber();
       int output = luck.findLucky(nums);
       System.out.println(output);
    }
}
