package DataStructures;
public class BinarySearch704 {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length;
        int mid = 0;
        while (start <= end) {

            mid = start + ((end - start) / 2);

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        BinarySearch704 binarySearchIndex=new BinarySearch704();
        int[] arr = {-1,0,3,5,9,12};
        int k = 9;
        int output =binarySearchIndex.search(arr,k);
        System.out.println("output"+output);
    }
}

