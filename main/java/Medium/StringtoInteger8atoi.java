package Medium;

public class StringtoInteger8atoi {

    public int myAtoi(String s) {

        s = s.trim();

        if(s.length() == 0) return 0;

        long ans = 0;

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(i==0 && (ch == '+' || ch =='-')){
                continue;
            }
            else if(ch > '9' || ch < '0'){ // not an integer

                break;
            }
            else if(ch ==' '){
                break;
            }
            else {
                if(ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE) {
                break;
                }

                    ans =(ans*10) + (ch - '0');
            }
        }
        if(s.charAt(0)=='-'){
            ans = -ans;
        }

        if(ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE){

            return ans<Integer.MIN_VALUE?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }

        return (int)ans;

    }

    public static void main(String[] args) {

    String  s = "words and 987";
    StringtoInteger8atoi atoi = new StringtoInteger8atoi();
    int answer = atoi.myAtoi(s);
    System.out.println(answer);
    }

}
