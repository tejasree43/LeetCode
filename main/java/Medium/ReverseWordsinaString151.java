package Medium;

public class ReverseWordsinaString151 {

    public String reverseWords(String s) {

       /* String[] splitStrings=s.split("\\s");

        StringBuffer sb=new StringBuffer();

        for(int i=splitStrings.length-1;i>=0;i--){
            if(!splitStrings[i].isEmpty()) {
                sb.append(splitStrings[i]);
                if(i!=0) {
                    sb.append(" ");
                }
            }


        }
     return sb.toString().trim();*/
        StringBuilder sb = new StringBuilder();

        String ans = "";
        String[] arr = s.split(" ");

        for(String str : arr){
            if(str.trim().isEmpty()) continue;
           // ans = str +" "+ans;
            ans = str.concat(" ").concat(ans);
        }
        return ans.trim();
    }

    public static void main(String[] args){
        String s = " a good   example ";
      //  String s = "  hello world  ";

        ReverseWordsinaString151 reverse=new ReverseWordsinaString151();
       String output= reverse.reverseWords(s);
       System.out.println(output);
    }
}
/*
Example:
        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.*/
