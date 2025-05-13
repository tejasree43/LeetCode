package Hard;

import Easy.ContainsDuplicate219;

public class Candy135 {

    public int candy(int[] ratings) {

        int n= ratings.length;
        int left[] = new int [n];
        int right[] =new int[n];

        left[0]=1;
        right[n-1]=1;

        for(int i=1;i<n;i++){

           if(ratings[i]>ratings[i-1]){
               left[i]=left[i-1]+1;
           }
           else{
               left[i]=1;
           }

        }
        for(int i=n-2;i>=0;i--){

            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
        }
        int answer =0;
        for(int i=0;i<n;i++) {
            answer+= Math.max(right[i],left[i]);
          }



        return answer;
    }

    public static void main(String[] args)
    {
        Candy135 candyInstance=new Candy135();
     int[]  input=  {1,0,2};

       // int[] input ={1,2,87,87,87,2,1}; //1 2 1 2 1
        int output=  candyInstance.candy(input);
        System.out.println("output"+output);

    }
}

