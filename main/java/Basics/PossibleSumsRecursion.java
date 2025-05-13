package Basics;
public class PossibleSumsRecursion {

    public void possibleSums(int[][] nums){
        int column=0;int sum=0;

        recursion(nums,column,sum);

    }

    private void recursion(int[][] nums,int column,int sum) {
        int temp=0;
        if(column>3){
            System.out.println("sum"+sum);
            return;
        }
        for(int row=0;row<4;row++){
            recursion(nums,column+1,sum+nums[row][column]);
            System.out.println("column values"+column);
            System.out.println("After recursion"+temp++);
        }



    }


    public static void main(String[] args)
    {
        int[][] number={{1,7,11,15},{2,5,9,13},{2,6,12,16},{4,8,10,14}};
        PossibleSumsRecursion psr=new PossibleSumsRecursion();
        psr.possibleSums(number);
    }
}
