package Easy;

import java.util.Hashtable;

public class CountElementsWithMaximumFrequency3005 {

    public int maxFrequencyElements(int[] nums) {

        Hashtable<Integer,Integer> ht = new Hashtable();

        int  maxFrequency = 0;

        for(int number :nums){
            int maxNumber = ht.getOrDefault(number,0)+1;
            maxFrequency=Math.max(maxFrequency,maxNumber);
            ht.put(number,maxNumber);
        }

        int counter = 0;
        System.out.println("maxFrequency"+maxFrequency);
        for(int value:ht.values()){
        if(maxFrequency==value){
            counter +=value;
        }
        }

        return counter;
    }

    public static void main(String[] args){

    //int[] nums = {1,2,2,3,1,4};
    int[] nums = {1,2,3,4,5};
    CountElementsWithMaximumFrequency3005 countElements = new CountElementsWithMaximumFrequency3005();
    int output = countElements.maxFrequencyElements(nums);
    System.out.println(output);
    }
}
