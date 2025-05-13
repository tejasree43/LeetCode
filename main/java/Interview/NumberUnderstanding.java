package Interview;

import Medium.TopKFrequentWords692;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class NumberUnderstanding {

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    public static void main(String[] args){

        Float f = new Float("3.0");
        int x=f.intValue();
        System.out.println("x"+(x));

        int b =f.byteValue();
        System.out.println("b"+(b));

        double d=f.doubleValue();
        System.out.println("d"+(d));


        System.out.println("total"+(x+b+d));

        HashMap hm = new HashMap();
        hm.put("abc",1);


    }
}
