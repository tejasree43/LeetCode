package Easy;

public class LengthofLastWord58 {
    public static int lengthOfLastWord(String s) {

        String[] s1=s.split(" ");
        String stringLength=s1[s1.length-1];
        return stringLength.length();
    }

    public static void main(String[] args) {

        LengthofLastWord58 lw=new LengthofLastWord58();
        int output = lw.lengthOfLastWord("Hello World");
        System.out.println("output="+output);

    }

}
