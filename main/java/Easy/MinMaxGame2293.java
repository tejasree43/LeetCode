package Easy;

public class MinMaxGame2293 {


public int minMaxGame(int[] nums) {

    int n = nums.length;
    int[] numsArray= new int[n/2];

    if(n==1){
        return nums[0];
    }
    for(int i =0;i<n/2;i++){

        if(i%2==0) {
            numsArray[i] = Math.min(nums[2*i],nums[2*i+1]);
        }
        else{
            numsArray[i] = Math.max(nums[2*i],nums[2*i+1]);

        }
    }

    return minMaxGame(numsArray);
}

public static void main(String[] args) {

    MinMaxGame2293 minMax = new  MinMaxGame2293();
    int n[] = {1,3,5,2,4,8,2,2};
    int result = minMax.minMaxGame(n);
    System.out.println("result"+result);

}
}

