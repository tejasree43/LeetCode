package Easy;

public class CalculateDigitSumofaString2243 {

    public String digitSum(String s, int k) {

        int n =s.length();

         if(n<=k){
             return s;
         }
        String help = "";
        int i;
        for( i =0;i<s.length()-k;i+=k) {

            String str = s.substring(i, i + k);
            int x = 0;
            for (char c : str.toCharArray()) {

                x += Character.getNumericValue(c);
            }
            help += x;
            }
            if(i!=s.length()){
                String str = s.substring(i);
                int x =0;
                for(char c:str.toCharArray()){

                x += Character.getNumericValue(c);
            }
              help +=x;
        }
        return digitSum(help,k);
    }

    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        CalculateDigitSumofaString2243 calculateDigit = new CalculateDigitSumofaString2243();
       String output = calculateDigit.digitSum(s,k);

       System.out.println("output"+output);
    }
}
