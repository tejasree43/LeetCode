package Basics;

 class Constructor {
     static String str;
     public void Constructor(){

        /* System.out.println("In ");
         str = "Hello World";*/
     }

     public static void main(String [] args) {
        /* Constructor c = new Constructor();
         System.out.println(str);*/
         
         try{
             badMethod();
             System.out.println("A ");
         }catch(Exception ex){
             System.out.println("B ");

         }
         finally{
             System.out.println("C ");

         }
         System.out.println("D ");

     }

     private static void badMethod() {
     }

 }
