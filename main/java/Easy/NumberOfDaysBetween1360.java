package Easy;

import java.text.ParseException;


public class NumberOfDaysBetween1360 {

    int[] daysPerMonth=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) throws ParseException {

       int result=Math.abs(daysFrom1971(date1)- daysFrom1971(date2));

       System.out.println("result"+result);
        return result;
    }

    public int daysFrom1971(String date){

        String[] splitDates=date.split("-");
        int year= Integer.parseInt(splitDates[0]);
        int month= Integer.parseInt(splitDates[1]);
        int day= Integer.parseInt(splitDates[2]);

        int yearsFrom1971=year-1971;
        System.out.println("yearsFrom1971="+yearsFrom1971);

        boolean isLeapYear=(year%4==0)&&(year%100!=0||year%400==0);

       if(month>2&&isLeapYear)
        {
         day++;
        }
        for(int m=1;m<month;m++){
           day+=daysPerMonth[m-1];
        }
        int countLeapYears= countLeapYears(year);
        System.out.println(countLeapYears);

        return day+yearsFrom1971*365+countLeapYears;
    }
    public int countLeapYears(int year){
    int count=0;
    for(int y=1971;y<year;y++){
    if((y%4==0)&&(y%100!=0||y%400==0)){
        count++;
     }
    }
        return count;
    }

    public static void main(String[] args){

       String date1 = "1971-06-29", date2 = "2010-09-23";
       NumberOfDaysBetween1360 number=new NumberOfDaysBetween1360();
        try {
            number.daysBetweenDates(date1,date2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
