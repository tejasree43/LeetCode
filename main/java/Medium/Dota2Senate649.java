package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate649 {

    public String predictPartyVictory(String senate) {
      Queue<Character> queue = new LinkedList<>();

      int rban = 0;int dban=0;int rCount=0;int dCount=0;

      for(char val:senate.toCharArray()){

          if(val == 'D'){
              dCount++;
          }
          else{
              rCount++;
          }
          queue.add(val);

      }
      while (dCount> 0&&rCount>0 ) {

          char current = queue.poll();

          if(current == 'D') {
              if(dban>0) {
                  dban--;
                  dCount--;
              }
              else {
                  rban++;
                  queue.add(current);

              }
          }
          else{
              if(rban>0) {
                  rban--;
                  rCount--;
              }
              else {
                  dban++;
                  queue.add(current);

              }
      }

      }
        return dCount>0?"Dire":"Radiant";
    }

    public static void main(String[] args) {
        Dota2Senate649  dota = new Dota2Senate649();
        String senate = "DRDRR";
       String output = dota.predictPartyVictory(senate);
       System.out.println("output"+output);
    }
}
