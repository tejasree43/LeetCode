


public class CharcomparisionDemo {

    public static String sortChar(String str) {

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 1; j <ch.length; j++) {
                if ( ch[j]<ch[i]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }

            }

        }
        return new String(ch);

    }

    public static void main(String args[]) {

        String str = "geeksforgeeks";
        String output= CharcomparisionDemo.sortChar(str);
        System.out.println("output"+output);

    }

}
