package Hard;

public class ValidNumber65 {


    public boolean isNumber(String s) {
        boolean pointFlag = false;
        boolean signedFlag = false;
        boolean letterEFlag = false;
        boolean digitFlag = false;

        int pointCount = 0;
        int letterEcount = 0;

        if(s.length()==1&&(s.charAt(0)=='+'||s.charAt(0)=='-'||s.charAt(0)=='.'))
        {
            return false;
        }


        for(int i=0;i<s.length();i++){

           char ch = s.charAt(i);
           //first signed check
            if(i==0&&(ch=='+'||ch=='-')){
                signedFlag = true;
                continue;
            }
            else if ((ch=='+'||ch=='-')&&signedFlag&&!letterEFlag){
                return false;
            }
            else if((ch=='+'||ch=='-')&&(i==s.length()-1)){
                return false;
            }
            else if ((ch=='+'||ch=='-')&&letterEFlag&&(i!=s.length()-1)) {

                if (s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E') {
                    continue;
                } else {
                    return false;
                }
            }

       else if(ch=='.'&&!letterEFlag){
                pointFlag=true;
                if(pointCount>0){
                    return false;
                }else if (pointFlag&&!digitFlag&&i==s.length()-1){
                    return false;

                }else {
                    pointCount++;
                    continue;
                }
           }
            else if(ch=='.'){
                if(letterEFlag||pointFlag){
                    return false;
                }
                pointFlag=true;
            }


           else if ((ch=='e'||ch=='E')&&(i!=s.length()-1)){
                letterEFlag = true;
                letterEcount++;

                if(letterEcount>1){
                    return false;
                }
                if(digitFlag) {
                    continue;
                }else{
                    return false;
                }
            }
           if(letterEFlag&&s.length()<3){
               return false;
           }
            else if(ch > '9' || ch < '0'){ // not an integer
              return false;
            }
            else if (ch <9 || ch >0){
               digitFlag =true;
           }

        }
        if(pointFlag&&s.length()==1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

      // String s = "+3.14";
       // String s ="-+3";
      // String s = "--6";
        // String s = "abc";
        //String s = "53.5e93";
       // String s = "93.5e93";
      //  String s = "+6e-1";
        //String s = "-123.456e789";
      // String s = "005047e+6";
       // 005047e+6
        //invalid numbers
        //String s = "1a";
       // String s = "95a54e53";
       // String s = "99e2.5" ;
        //String s = "e9" ;
       //  String s ="..";
       // String s =".e1";
       String s ="+.";
       // String s = "+0e-";
       // String s = "6ee69";
       // String s ="+.00e1e.";
       // String s = "6+1";
        //String s="092e359-2";
       // String s="+";

        ValidNumber65 validNumber = new ValidNumber65();
        boolean answer = validNumber.isNumber(s);
        System.out.println("valid Number ="+answer);
    }
}