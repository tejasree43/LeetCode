package Interview;

public class FindNumberOccurences {

/*    Time complexity: O(logn).
    Space complexity: O(1).*/
    private int numberOfOccurrence(int[] arr, int target) {

    int left  = binarySearchTarget(arr,target,true);
        if (left < 0) return 0;

    System.out.println("left"+left);
        int right  = binarySearchTarget(arr,target,false);
        System.out.println("right"+right);

        return right -left+1;
    }

    private int binarySearchTarget(int[] arr, int target, boolean leftmost) {

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {

            int midIndex = (low + high) / 2;

            if (target< arr[midIndex]) {

                high = midIndex - 1;
            } else if(target > arr[midIndex]) {
                low = midIndex + 1;
            }
            else{
                index = midIndex;
                if(leftmost){
                    high = midIndex - 1;
                }
                else{
                    low = midIndex + 1;
                }
            }
        }
        return index;
    }


    public static void main(String [] args){

     int[] arr = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
     int target = 23 ;
     FindNumberOccurences findNumber = new FindNumberOccurences();
     int output = findNumber.numberOfOccurrence(arr,target);

     System.out.println("output"+output);

    }


}
