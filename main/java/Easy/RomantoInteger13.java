package Easy;

public class RomantoInteger13 {

    public static int romanToInt(String s) {

        char[] input=s.toCharArray();
        char[] symbols={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[]  Values={1,5,10,50,100,500,1000};
        int Previousvalue = 0;
        int output=0;
        int temp = 0;

        for (int i=0;i<input.length;i++) {

            for (int j = 0; j < symbols.length; j++) {

                if (input[i] == symbols[j]) {
                    System.out.println("first loop Values[j] ="+Values[j]);
                    System.out.println("print  temp ="+temp);

                    if((temp!=0) && (temp<Values[j]) ){
                        int iftemp=0;
                        System.out.println("second loop");
                        iftemp = Values[j]-Previousvalue;
                        output+=iftemp-Previousvalue;
                        System.out.println("output in if block"+output);
                    }
                    else{
                        System.out.println("else loop");
                        Previousvalue = Values[j];
                        output += Values[j];
                        System.out.println("Previousvalue"+Previousvalue);
                        System.out.println("output"+output);
                    }
                    temp = Values[j];


                }

            }

        }
        return output;

    }
    public static void main(String[] args)
    {
    int output  =  RomantoInteger13.romanToInt("MCMXCIV");
    System.out.println("output"+output);
    }
}
