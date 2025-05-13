package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateinArray442 {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;

        int i=0;
        while(i<nums.length){

            if(i+1<n&&nums[i]==nums[i+1]){
                res.add(nums[i]);
            }
            i++;
        }
        return res;

    }
    public static void main(String[] args){

     int[] array={4,3,2,7,8,2,3,1};
     FindAllDuplicateinArray442 findDuplicates=new FindAllDuplicateinArray442();
      List<Integer> output= findDuplicates.findDuplicates(array);
        output.stream().forEach(System.out::println);


    }
}
