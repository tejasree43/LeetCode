package Basics.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

    public static Date stringToDate(String d) throws ParseException {

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy") ;

        Date date= dateFormat.parse(d);
        return date;
    }
}
