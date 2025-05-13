public class RecursionDemo {
    int count=0;
    public void sayHiRecusrion(int count)
    {
        System.out.println("Hi Recursion Iam new to the Recursion bless me count variable"+count);

        if(count<-1) {
            return ;
        }
        sayHiRecusrion(count-1);

    }

    public static void main(String[] args)
    {
        RecursionDemo rd=new RecursionDemo();
        System.out.println("Hi");
        rd.sayHiRecusrion(3);
    }
}
