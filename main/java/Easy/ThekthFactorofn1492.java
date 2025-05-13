package Easy;

import java.util.ArrayList;

public class ThekthFactorofn1492 {

    public int kthFactor(int n, int k) {

        ArrayList<Integer> al =new ArrayList();
         int i=1;
          while(i<=n){
           if(n%i==0){
            al.add(i);
            if(k==al.size()){
                return i;
            }
           }
           i++;
        }
        return -1;
    }
public static void main(String[] args) {

   int n = 7, k = 2  ;

    ThekthFactorofn1492 kthFactor= new ThekthFactorofn1492();

   int output = kthFactor.kthFactor( n,k);

   System.out.println("output"+output);

}
}
