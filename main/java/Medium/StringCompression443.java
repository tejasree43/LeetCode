package Medium;

 class StringCompression443 {

    public int compress(char[] chars) {


        int n = chars.length;
        int i =0; int j =0;
        while(i<n){
          int count = 1;
          while(i+1<n&&chars[i]==chars[i+1])  {
                  count++;
                  i++;
          }
            chars[j] =chars[i];
            j++;
            if(count>1){

               String counterString =String.valueOf(count) ;
               for(int k =0;k<counterString.length();k++){
                   chars[j] =counterString.charAt(k);
                   j++;
               }

            }


          i++;

        }

        return j;
    }
    public static void main(String[] args){
      char[]  chars = {'a','a','a','b','b','c','c','d'};

      StringCompression443 stringCompress=new StringCompression443();

      int output=stringCompress.compress(chars);
      System.out.println(output);
    }
}

       /* Example 1:
        Input: chars = ["a","a","b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

        Example 2:
        Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]
        Explanation: The only group is "a", which remains uncompressed since it's a single character.

        Example 3:
        Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
        Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 */