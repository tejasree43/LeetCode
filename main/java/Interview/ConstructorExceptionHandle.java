package Interview;


import java.io.IOException;

class Airplane {

    public Airplane() throws IOException {

        System.out.println("Airplane");
        throw new IOException();
    }
}
class AirJet extends Airplane {
    public AirJet() throws IOException {
        super();

        System.out.println("AirJet");

    }

    /*public AirJet() throws IOException {
    }*/
}
public class ConstructorExceptionHandle {

    public static void main(String[] args) throws IOException {

        new AirJet();

    }
}
