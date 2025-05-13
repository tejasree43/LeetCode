package Interview;

class B extends A{
    public void testB(){

    }

}
class C extends B{
    public void testC(){

    }

}
 class A {

    public void testA(){

    }

    public static void main(String [] args){

    B b = new B();

    if(b instanceof B && !(b instanceof A)  ){
        System.out.println("b instanceof B && b instanceof A true");
    }else {
        System.out.println("b instanceof B && b instanceof A false");
    }
        if(b instanceof B && !(b instanceof C)  ){
            System.out.println("b instanceof B && b instanceof C true");
        }else {
            System.out.println("b instanceof B&& b instanceof C false");
        }

    }

}

