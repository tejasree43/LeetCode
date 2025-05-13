package Medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses93 {


    //Input: s = "25525511135"
    //Output: ["255.255.11.135","255.255.111.35"]
    //minimu dots 3
    List<String>  listOutput = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {

        backtracking(0 ,s,new ArrayList<>());

        System.out.println(listOutput);
        return listOutput;
    }

    private void backtracking(int start, String s, List<String> temp) {
        if(temp.size()==4){
            if(start==s.length()) {
                listOutput.add(String.join(".", temp));
            }
            return;
        }
        for(int i =start;i<Math.min(i+3,s.length());i++){

            if(ValidDigit(s.substring(start,i+1))){
                String sub = s.substring (start,i+1);
                temp.add(sub);
                backtracking( i+1, s,temp);
                temp.remove(temp.size()-1);

            }

        }
    }

    private boolean ValidDigit(String s) {

        if ((s.length()>3)||(s.length()>1&&s.charAt(0)=='0')){
         return false;
        }
        if (Integer.parseInt(s)>255)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

       // String s = "25525511135" ;

    String s = "101023" ;
    RestoreIPAddresses93 restore = new RestoreIPAddresses93();
    restore.restoreIpAddresses(s);
    }
}
