package Medium;

public class RangeSumQueryMutable307 {

        int[] nums ;
        public RangeSumQueryMutable307(int[] nums) {
          //  nums =new int [nums.length];
            this.nums = nums;
        }

        public void update(int index, int val) {
        nums[index] = val;
        }

        public int sumRange(int left, int right) {
            int sumTotal = 0;
            for(int i =left ;i<=right;i++){
                sumTotal +=nums[i];

            }
            return sumTotal;
        }

    public static void main(String[] args) {
     int[] NumArray ={1, 3, 5};
        RangeSumQueryMutable307 sum = new RangeSumQueryMutable307(NumArray);
      int output =  sum.sumRange(0,2);
        sum.update(1,2);
      int updatedOutput = sum.sumRange(0,2);

      System.out.println(output);
     System.out.println(updatedOutput);




    }
}
