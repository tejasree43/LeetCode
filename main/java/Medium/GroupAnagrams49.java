package Medium;

import java.util.*;

class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new LinkedHashMap<>();

       for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);

            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            /* List<String> temp= map.get(s);
            temp.add(str);*/
            map.get(s).add(str);
           }
          ans.addAll(map.values());
          System.out.println(ans);
        return ans;
    }

    public static void main(String[] args){
        GroupAnagrams49 groupAnagrams=new GroupAnagrams49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams.groupAnagrams(strs);
    }
}
