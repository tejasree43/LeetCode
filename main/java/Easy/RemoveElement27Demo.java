package Easy;

public class RemoveElement27Demo {
    public static int removeDuplicates(int[] nums, int val) {

        if (nums.length == 0){
            return 0;
         }

        int addIndex = 0; //index that unique characters will be inserted at

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]!=val) { //if true, num[i + 1] is a new unique number
                System.out.println("if loop");
                nums[addIndex] = nums[i];
                addIndex++;
            }
        }
        return addIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        int val=3;
        int output = RemoveElement27Demo.removeDuplicates(nums, val);

        System.out.println("output"+output);

        //   Arrays.stream(output).forEach(s->System.out.println(s));
    }
}
