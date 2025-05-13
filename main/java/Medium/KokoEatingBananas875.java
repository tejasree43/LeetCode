package Medium;

public class KokoEatingBananas875 {

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int max = Integer.MIN_VALUE;

        for(int pile : piles){
            max=Math.max(max,pile);
        }

     //   int end = max;
        int end = piles[piles.length-1];

            while (start < end) {

                int mid = start + ((end - start) / 2);

                 if (koko(mid,piles)>h) {

                    start = mid+1;
                }
                 else{
                    end = mid;
                }

            }

        return start;
    }

    private int koko(int mid, int[] piles) {
        int sum = 0;
        for(int i =0;i<piles.length;i++){

          sum +=Math.ceil((double)piles[i]/mid);
        }
        return sum;
       /* int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.ceil((double)arr[i]/mid);
        }*/
       // return sum;
    }

    public static void main(String[] args) {

     int[]  piles = {3,6,7,11};
     int  h = 8 ;
     KokoEatingBananas875 koko = new KokoEatingBananas875();
     int output = koko.minEatingSpeed(piles,h);

     System.out.println("output"+output);
    }

}
