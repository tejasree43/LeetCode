import java.util.Arrays;

 class FindDuplicatesinArray {


         public static void main(String args[])
         {
             int inputArray[] = { 0, 4, 3, 4,2, 7, 8, 2, 3, 1 ,7};

          int arrayLength  = inputArray.length;
          System.out.println("arrayLength"+arrayLength);

             for (int i = 0; i < inputArray.length; i++) {
                 int s =inputArray[inputArray[i] % arrayLength];
                 System.out.println("s value"+s);
                 inputArray[inputArray[i] % arrayLength]= inputArray[inputArray[i] % arrayLength]
                         + arrayLength;
             }
             System.out.println("The repeating elements are : ");
             for (int i = 0; i < inputArray.length; i++) {
                 if (inputArray[i] >= inputArray.length * 2) {
                     System.out.println(i + " ");
                 }
             }
         }
     }

