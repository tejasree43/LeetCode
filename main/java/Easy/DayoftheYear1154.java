package Easy;

import java.text.ParseException;

public class DayoftheYear1154 {

    int[] daysPerMonth=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    public int dayOfYear(String date) {

        String[] splitDate=  date.split("-");
        int year= Integer.parseInt(splitDate[0]);
        int month= Integer.parseInt(splitDate[1]);
        int day= Integer.parseInt(splitDate[2]);

       boolean isLeapYear= year%4==0&&year%100!=0||year%400==0;
       if(month>2&&isLeapYear)
       {
           day++;
       }
       for(int m=1;m<month;m++){
           day+=daysPerMonth[m-1];
       }
       return day;
    }
    public static void main(String[] args){

        String date1 = "2004-03-01";
        DayoftheYear1154 number=new DayoftheYear1154();
        int days=number.dayOfYear(date1);

        System.out.println("days"+days);
    }

}
