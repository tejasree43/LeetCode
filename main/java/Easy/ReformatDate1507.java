package Easy;

import java.util.Hashtable;

public class ReformatDate1507 {

    public String reformatDate(String date) {

        System.out.println("date length"+date.length());


        Hashtable<String,String> months=new Hashtable<>();

        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");
        StringBuilder sb=new StringBuilder();

        String[] stringDate = date.split(" ");
        sb.append(stringDate[2]);
        sb.append("-");
        sb.append(months.get(stringDate[1]));
        sb.append("-");

        sb = date.length()==13 ? sb.append(stringDate[0].substring(0, 2)): sb.append("0"+stringDate[0].substring(0, 1));
//        if (date.length()==13) {
//            sb.append(stringDate[0].substring(0, 2));
//        }
//        else{
//            sb.append(stringDate[0].substring(0, 1));
//        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String date = "6th Jun 1933";
        ReformatDate1507 rfd = new ReformatDate1507();
        String output = rfd.reformatDate(date);
        System.out.println("ReformatDate=" + output);
    }
}

/*      Input: date = "20th Oct 2052"
        Output: "2052-10-20"*/
