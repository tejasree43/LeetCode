package Easy;
;

public class CanPlaceFlowers605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int length = flowerbed.length;
        int i=0;int j=0;
        while(i<length && n!=0)
        {

           if(flowerbed [i]==0) {
               if ((i == 0 || flowerbed[i - 1] != 1) &&( i == length - 1 || flowerbed[i + 1] != 1) ){
                   flowerbed[i]=1;
                   n--;
               }
           }
            i++;
         }

        return n <= 0;
    }

    public static void main(String[] args) {
       int[] flowerbed = {1,0,0,0,0,1};
       int n = 2;
        CanPlaceFlowers605 flowers = new CanPlaceFlowers605();
       boolean output =flowers.canPlaceFlowers(flowerbed,n);

       System.out.println("output="+output);

    }
}
