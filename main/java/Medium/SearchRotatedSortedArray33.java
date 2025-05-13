package Medium;

import java.util.Arrays;

public class SearchRotatedSortedArray33 {
    public int search(int[] nums, int target) {

        int n= nums.length;
        int i=0;
        int low = 0;
        int high= nums.length-1;
        while(low<=high){
        int midIndex=low+(high-low)/2;
        int midValue=nums[midIndex];
        if(target==midValue){
            return midIndex;
        }
        // if elements from mid to hi are sorted in increasing order and target exist b/w them

        else if(target<midValue&&target<=nums[high]&&midValue>=nums[high]){

            low=midIndex+1;
        }
        // if pivot  elements exist between mid to hi  and target exist b/w them
        else if(target>midValue&&(target<=nums[high]||midValue>=nums[high])){
            low=midIndex+1;
        }
        else{
            high=midIndex-1;
        }
        i++;
        }


        //Brute Force O(n) Time complexisty
       /* while(i<n){

            if(target==nums[i])
            {
                return i;
            }
         i++;

        }
*/





            return -1;
    }

    public static void main(String[] args) {

    SearchRotatedSortedArray33 searchRotatedSorted=new SearchRotatedSortedArray33();

    int[] tickets = {1,3};
    int  target =3;
    int output=searchRotatedSorted.search(tickets,target);
    System.out.println("output"+output);

    }
}
