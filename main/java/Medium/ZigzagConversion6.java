package Medium;
import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion6 {

    public String convert(String s, int numRows) {

       Map<Integer,StringBuffer> hmap=new HashMap<>();
       boolean zigDown=false;
       int i=0;

       for(char c:s.toCharArray()){
           hmap.put(i,hmap.getOrDefault(i,new StringBuffer()).append(c))  ;
           if(i==0){
               zigDown=true;
           }
           else if(i==numRows-1){
               zigDown=false;
           }
          if(zigDown) {
              i++;
          }
          else{
              i--;
          }
      }

       StringBuffer sb=new StringBuffer();
       for(int j=0;j< hmap.values().size();j++)
       {
          sb.append(hmap.getOrDefault(j,new StringBuffer()));
       }
        return sb.toString();
    }

    public static void main(String[] args)
    {
      ZigzagConversion6 zig=new ZigzagConversion6();
      /*String s = "PAYPALISHIRING";
      int numRows = 3;*/
      String s="PAYPALISHIRING";
      int numRows = 4;
      String output= zig.convert( s , numRows);
      System.out.println("output="+output);

    }
}

/*
Example 1:

        Input: s = "PAYPALISHIRING", numRows = 3
        Output: "PAHNAPLSIIGYIR"*/
/*
Example 2:
        Input: s = "PAYPALISHIRING", numRows = 4
        Output: "PINALSIGYAHRPI"
        Explanation:
        P     I    N
        A   L S  I G
        Y A   H R
        P     I*/

/*
ZigZag Approach using the below  example

  A              G                   M            ->hmap row1
    B           F    H             L     N        ->hmap row 2
        C     E          I       K        --      -->hmap row 3
           D                  J              --   -->hmap row 4
 */
