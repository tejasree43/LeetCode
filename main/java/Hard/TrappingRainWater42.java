package Hard;

public class TrappingRainWater42 {
    public int trapRainWater(int[] height) {

        System.out.println("height.length="+height.length);

        int units = 0;
        int n = height.length;
        for(int i=0;i<n;i++)
        {
        int leftHeight =0;

        for(int j=0;j<=i;j++){
            leftHeight= Math.max(leftHeight,height[j]);
        }
         int rightHeight =0;

        for(int k=i;k<n;k++){
            rightHeight= Math.max(rightHeight,height[k]);
         }
            units+=Math.min(leftHeight,rightHeight)-height[i];
        }

      //  Math.max()

        return units;
    }

    public static void main(String[] args)
    {
        TrappingRainWater42 tr=new TrappingRainWater42();
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int output=tr.trapRainWater(height);
        System.out.println("output="+output);

    }
}

/*
Input: height = [4,2,0,3,2,5]
        Output: 9*/

/*Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6*/



