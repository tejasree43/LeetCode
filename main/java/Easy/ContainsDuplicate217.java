package Easy;

public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {

        //HashTable solution
       /* Hashtable<Integer,Integer> hm=new Hashtable<>();
        int count=0;
        for(int number:nums)
        {
                hm.put(number, count);
        }
        if(nums.length!=hm.size())
        {
            return true;
        }
       return false;*/
        //Iterative Solution
        boolean changed = true;
        int end=nums.length-1;
        while(end>0) {
            changed=false;
            for (int i = 0; i < end; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
            end--;
        }
       return false;

    }

    public static void main(String[] args){

        ContainsDuplicate217 cd=new ContainsDuplicate217();
        int[] nums = {1,2,3,4,5,1};
        boolean output =cd.containsDuplicate(nums);
        System.out.println("output="+output);


    }
}
