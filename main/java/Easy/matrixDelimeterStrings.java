package Easy;

import java.util.Arrays;

public class matrixDelimeterStrings {

    public String[] tikTok(String[] words)
    {

        String all = "";
           for(String word:words) {
               all+=word;

       }
       String[] output = all.split("$");
       return output;

    }

    public static void main(String[] args){
     matrixDelimeterStrings matrixDelimeter = new matrixDelimeterStrings();
     String[] matrix= {"one$", "two$three$", "four", "five", "six$", "seven$"};
    String[] output= matrixDelimeter.tikTok(matrix);
    System.out.println(Arrays.asList(output));
     Arrays.stream(output).forEach(s->System.out.println(s));
    }
}
