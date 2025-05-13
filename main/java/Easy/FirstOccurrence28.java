package Easy;

public class FirstOccurrence28 {


    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int endIndex=needle.length();
        for (int i = 0; i<=n-1; i++) {
            if(endIndex<=n) {
                String a1 = haystack.substring(i, endIndex);
                System.out.println("a1 subString=" + a1);
                if (a1.equals(needle)) {
                    System.out.println("inside if loop");
                    return i;
                }
            }
            endIndex++;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        FirstOccurrence28 fb=new FirstOccurrence28();
       String haystack = "sadbutsad";
       String needle = "sad";
       int output= fb.strStr(haystack,needle);

        System.out.println("output"+output);
    }
}
