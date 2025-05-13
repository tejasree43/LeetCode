package Easy;

import java.util.*;

import static java.util.EnumSet.range;

public class FindNumbersDisappeared448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map=new HashMap();

        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int j=1;
        while(j<=nums.length){

           if(!map.containsKey(j)){
               result.add(j);
            }
           j++;
        }

System.out.println("result"+result);

     return result;
    }

    public static void main(String[] args){
        FindNumbersDisappeared448 findNumbersDisappeared=new FindNumbersDisappeared448();
        //int [] nums = {4,3,2,7,8,2,3,1};
        int [] nums = {1,1};

        findNumbersDisappeared.findDisappearedNumbers(nums);


    }
}
