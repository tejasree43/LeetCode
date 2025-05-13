package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> answer = new ArrayList<>();

        int[] maxCandies = new int[candies.length];

        for(int i =0;i<maxCandies.length;i++){
            maxCandies[i] =Integer.MAX_VALUE;
        }
        int i =0;

        while(i<candies.length){

            int value = candies[i] + extraCandies;
            maxCandies[i] = value;

            int testValue = Arrays.stream(maxCandies).min().getAsInt();
            if(i==0){
                testValue = value;
            }
            maxCandies[i] = value;
            if(value >=testValue){
                answer.add(true);
            }
            else{
                answer.add(false);

            }
            i++;
        }

        return answer;
    }
    public static void main(String[] args) {
     int[]  candies = {4,2,1,1,2};
     int extraCandies = 1;
     KidsWiththeGreatestNumberofCandies1431 kwg = new KidsWiththeGreatestNumberofCandies1431();
     List<Boolean> output = kwg.kidsWithCandies(candies,extraCandies);
     output.stream().forEach(System.out::println);
    }
    }
