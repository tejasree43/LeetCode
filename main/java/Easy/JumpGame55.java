package Easy;

public class JumpGame55 {

    public boolean canJump(int[] nums) {


        int n = nums.length;
        System.out.println("print n" + n);
        int tempJump = nums[0];
        int nextJump = 0;
        int nextIndex = 0;
        int i=0;int k=0;
        boolean tempJumpUpdated=false;

        if(n==1)
        {
            return true;
        }

        while(i<n)
        {
            if(tempJumpUpdated)
            {
                tempJump=nextJump;
            }
            k=nextIndex;
            int j=0;
          while(j<tempJump)
          {

              nextJump=nums[k];
              tempJumpUpdated=true;
              nextIndex=k;
              k++;
              j++;
          }
            if(k==(n-1))
            {
                return true;
            }
            i++;
        }



        //Two pointers approach
       //Complexity  O(n) and Space O(1)
       /* if(n==1)
        {
            return true;
        }
        int i=0;int j=1;
        while(i<j && j<n) {
            if ((j-i) <= nums[i]) {
                if (j == n - 1) {
                    return true;
                }
                j++;
            } else {
                i++;
            }
        }*/
            return false;

    }

    public static void main(String[] args) {
        JumpGame55 jg=new JumpGame55();
        int[] input={3,2,1,0,4};//false
        int[] input1={2,3,1,1,4};
        int[] input2={1,2,3};

        boolean output= jg.canJump(input2);
        System.out.println(output);

      //  [1] -true
      //{0}-true
    }

}
