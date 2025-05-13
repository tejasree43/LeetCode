package Easy;

import java.util.HashMap;

public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> hMap = new HashMap<>();
        boolean [] visit = new boolean[128];
        int [] visit1 = new int[128];

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){

            if(hMap.containsKey(s.charAt(i))){
             if(!hMap.get(s.charAt(i)).equals(t.charAt(i))){
                 return false;
             }
            }
            else {

                if(visit[t.charAt(i)]==true){
                    return false;
                }
                visit[t.charAt(i)] = true;
                hMap.put(s.charAt(i), t.charAt(i));
            }

        }

        return true;
    }
    public static void main(String[] args){
      // String s = "egg", t  = "add";
        String  s = "badc",  t = "baba";
       // String s = "paper", t = "title";
        IsomorphicStrings205 isomorphic = new IsomorphicStrings205();
       boolean output =  isomorphic.isIsomorphic(s,t);
       System.out.println("output"+output);
    }
}
