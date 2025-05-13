package Medium;

import Basics.IsPalindromeDemo;

import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning131 {


    List<List<String>> result=new LinkedList<>();
    public List<List<String>> partition(String s) {

      backtracking(s,new LinkedList<>(),0);
       return result;
    }

    private void backtracking(String s, LinkedList<String> list, int start) {

    if(start==s.length()){
        result.add(new LinkedList<>(list));
        return;
    }

      for(int i=start;i<s.length();i++)

      {
          if(IsPalindromeCheck(s,start,i)){
              String sub=s.substring(start,i+1);
              list.add(sub);
              backtracking(s,list,i+1);
              list.remove(list.size()-1);

          }
      }
    }

    public static boolean IsPalindromeCheck(String s,int low,int high) {
        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;

        }
        return true;
    }

    public static void main(String[] args){
        String  s = "aab";
        PalindromePartitioning131 pp=new PalindromePartitioning131();
        pp.partition(s);
        //System.out.println("palindrome"+output);
    }
}
