package Easy;

public class ReverseString344 {

    public String reverseString(char[] chars) {

            int start = 0;
            int end=chars.length-1;
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }


        return new String(chars);


    }


        public static void main(String[] args){

        ReverseString344 reverseString=new ReverseString344();
        char[] s = {'h','e','l','l','o'};
        String output= reverseString.reverseString(s);
        System.out.println("output="+output);
    }

}
