import java.util.Arrays;

public class RemoveDuplicatesinArray {


    public static int removeDuplicates(int[] inputArray,int n)
    {
       if(n==0||n==1)
       {
           return n;
       }
       int temp[] =new int[n];
       int j=0;

      for(int i=0;i<inputArray.length-1;i++)
        {
       if(inputArray[i]!=inputArray[i+1]){
          inputArray[j++]=inputArray[i];
       }
        }
        inputArray[j++]=inputArray[n-1];

        System.out.println("temp length"+temp.length);

        return j;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] inputArray={2,2,2,4,5,4,3,3,5,2};
        int[] streamedArray= Arrays.stream(inputArray).sorted().toArray();
        Arrays.stream(streamedArray).forEach(s->System.out.println(s));
        int n=  inputArray.length;
        int output =  RemoveDuplicatesinArray.removeDuplicates(streamedArray,n);
         System.out.println("n length"+n);
        for(int i=0;i<output;i++)
        {
         System.out.println (streamedArray[i]);
        }
    }
}
