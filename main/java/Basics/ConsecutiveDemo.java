package Basics;

public class ConsecutiveDemo {

    public boolean consecutive(String input){

      char[] ch=  input.toCharArray();

    //  for


        return false;
    }

    public static void main(String[] args){

        ConsecutiveDemo cd=new ConsecutiveDemo();
        String s="101112";
        cd.consecutive(s);


    }
}
