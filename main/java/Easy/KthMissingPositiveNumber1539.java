package Easy;

public class KthMissingPositiveNumber1539 {

    public int findKthPositive(int[] arr, int target) {

     //my own approach brute force approach
      /*int n=arr.length;
      ArrayList<Integer> al=new ArrayList<>();
      int i=1;int j=0;
      while(al.size()<=target) {

           if (j < n) {
               int temp=arr[j];
               if (i == arr[j]) {
                   temp=arr[j];
                   i++;
                   j++;
               }
               if (i < temp) {
                   al.add(i);
                   i++;
               }
           }
           else{
               al.add(i);
               i++;
           }
       }int output=al.get(target-1);*/

        //Time Complexity is O(log n) where n is the input Array are
        //Space Complexity O(1) because we are not using any extra space.
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
           int mid=start+((end-start)/2);
           int temp=arr[mid]-(mid+1);
           if(temp<target)
           {
           start= mid+1   ;
           }
           else{
           end =mid-1;
           }
        }
     return start+target;
    }


    public static void main(String[] args)
    {
        KthMissingPositiveNumber1539 kmp=new KthMissingPositiveNumber1539();
        int[] arr = {2,3,4,7,11};
        //int[] arr = {1,2,3,4};
        int k = 5;
        int output =kmp.findKthPositive(arr,k);
        System.out.println("output"+output);
    }
}
