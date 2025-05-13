package Medium;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConvertanArrayIntoa2DArray2610 {
    public List<List<Integer>> findMatrix(int[] nums) {

      /*  List<List<Integer>> answer = new ArrayList<>();
        Map<Integer,Integer> frequencyMap = new ConcurrentHashMap<>();

        for(Integer number:nums) {
            frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
        }

        while(frequencyMap.size()!=0){

            ArrayList<Integer> numbers = new ArrayList<>();
            for(Map.Entry<Integer,Integer> ins : frequencyMap.entrySet()){
             int key =   ins.getKey();
             int value = ins.getValue();
             numbers.add(key);
              if (value==1){
             frequencyMap.remove(key);
              } else{
              frequencyMap.replace(key,value-1);
              }
             }
             answer.add(numbers);
            }
        System.out.println(answer);
        return answer;*/

        List<List<Integer>> answer = new ArrayList<>();

        int frequency[] = new int[nums.length+1];

        for(Integer n:nums){

            if(frequency[n]>=answer.size())
            {
                answer.add(new ArrayList<>());
            }

            answer.get(frequency[n]).add(n);
            frequency[n]++;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){

     int[] nums = {1,3,4,1,2,3,1};
     ConvertanArrayIntoa2DArray2610 convertArray = new ConvertanArrayIntoa2DArray2610();
     convertArray.findMatrix(nums);

    }
}
