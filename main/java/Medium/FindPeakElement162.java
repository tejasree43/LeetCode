package Medium;

public class FindPeakElement162 {

    public int findPeakElement(int[] nums) {

        int start = 0;
        int end =nums.length-1;

        while(start<end){

            int mid = start + ((end - start) / 2);
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

     return start;
    }

    public static void main(String[] args){
    int nums[] ={1,2,1,3,5,6,4};
    FindPeakElement162  findPeak = new FindPeakElement162();
    int output = findPeak.findPeakElement(nums);
    System.out.println("output"+output);

    }
}
