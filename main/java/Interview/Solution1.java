package Interview;

 class Solution1 {
     //AABBAABBAA

     public String strWithout3a3b(int AA, int AB, int BB) {
        StringBuilder sb = new StringBuilder();
         StringBuilder ans = new StringBuilder();
         while(AA > 0 || AB > 0 || BB >0){

             if(ans.length() < 2){
                 if(AA > AB){
                     ans.append("AA");
                     AA--;
                 }else if (AB >AA){
                     ans.append("AB");
                     AB--;
                 }
                 else{
                     ans.append("BB");
                     BB--;
                 }
             } else {
                 if(AA > AB){
                     if(ans.substring(ans.length() - 2).equals("AB")){
                         ans.append("AA");
                         AA--;
                     }
                 }else if (AB >AA){
                     if(ans.substring(ans.length() - 2).equals("BB")){
                         ans.append("AB");
                         AB--;
                     }
                 }
                 else if (BB >AA){
                     if(ans.substring(ans.length() - 2).equals("AA")){
                         ans.append("BB");
                         BB--;
                     }
                 }else{
                     if(ans.substring(ans.length() - 2).equals("AB")){
                         ans.append("AA");
                         AA--;
                     }else if (ans.substring(ans.length() - 2).equals("BB")){
                         ans.append("AB");
                         AB--;
                     }
                     else{
                         ans.append("BB");
                         BB--;
                     }
                 }
             }
         }

         return ans.toString();

     }

    public static void main(String[] args)
    {


      /*  int AA = 5;
        int AB =0;
        int BB = 2;*/

     int AA = 1;
        int AB =2;
        int BB = 1;
        // Function call

        Solution1 sol = new Solution1();
        String answer = sol. strWithout3a3b(AA,AB,BB);

            System.out.print(answer);

          //  System.out.print("False");
    }
}
