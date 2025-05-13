package Easy;

public class BinarySearchDemo35 {

    public static int BinarySearch(int[] numbers,int targetValueIndex)
    {

        int low=0;
        int high=numbers.length-1;
        int midValue =0;

        while (high>=low)
        {
        int midPosition=low+(low-low)/2;
          midValue = numbers[midPosition];

          if(midValue==targetValueIndex)
         {
            System.out.println("inside if loop1");
            return midPosition;
         }
        if( midValue < targetValueIndex)
        {
            System.out.println("inside if loop2");
            low = midPosition +1;
            System.out.println("low="+low);
            System.out.println("high"+high);
        }
        else //high than midvalue
        {
            System.out.println("inside else loop");
            high = midPosition -1;
        }

        }
        if(midValue==high)
        {
            return high;
        }
        else{
            System.out.println("else low");
            return low;
        }
    }

    public static void main(String[] args)
    {

      int n[] = {-1,3,5,6};
      int target =0;
      int output = BinarySearchDemo35.BinarySearch(n,target);
      System.out.println("output" +output);

    }
}
