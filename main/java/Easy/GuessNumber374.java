package Easy;


class GuessGame{

    int num;
    int pick =6;

    int guess(int num){
       this.num = num;
       if(num==pick){
           return 0;
       }
       else if( num > pick){
           return -1;
       }
        if(num < pick){
           return 1;

       }
        return 0;
    }
}
 class GuessNumber374 extends GuessGame {



     public int guessNumber(int n) {
       int start = 1;
       int end = n;
         while(start <= end)
         {

         int mid = start+(end-start)/2;

         if(0 == guess(mid)){
             return mid;
         }
         else  if (guess(mid) ==1){
             start= mid+1;
         }
         else{
             end= mid-1;
         }
         }

         return -1;
     }

    public static void main(String[] args){
        int  n = 10;

    GuessNumber374 guess = new GuessNumber374();
        GuessGame g = new GuessGame();
       int output= guess.guessNumber(n);
       System.out.println("output"+output);

    }
}

