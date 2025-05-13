import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OkxDemo {
   /* public static void printAllPossibleOrder(char[] input)
    {

        for(int  i=0;i<input.length-1;i++)
        {
            for(int j=0;j<input.length-1;j++)
            {
                System.out.println(input[i]+""+input[j]+""+input[i+1]);
            }
        }

    }*/
   int n;
    List<List<Integer>>  ans;
    public  List<List<Integer>>  permute( int[] nums)
    {
        n=nums.length;
        ans= new LinkedList();
        backtrack(nums,0);
        return ans;
    }
    void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
     void backtrack(int[] nums, int start){
        System.out.println();

      if(start==n){
          System.out.println("inside the loop");
          List<Integer> linkedList=Arrays.stream(nums).boxed().collect(Collectors.toList());
          ans.add(linkedList);
          return;
      }
      for (int i=start;i<nums.length;i++)
      {
          swap(nums,start,i);
          backtrack(nums,start+1);
          swap(nums,i,start);
      }
    }

    public static void main(String[] args)
    {
     int[] input = {1,2,3};

        OkxDemo okx=new OkxDemo();
        List<List<Integer>>  ansOutput=  okx.permute(input);

        ansOutput.stream().forEach(s->System.out.println(s));


      /*  123
        132
        213
        231
        312
        321*/
    }
}
