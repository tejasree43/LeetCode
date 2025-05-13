package Easy;

public class DetermineifTwoEventsHaveConflict2446 {
    public boolean haveConflict(String[] event1, String[] event2) {

       String start= event1[0];

       int event1StartHour = Integer.parseInt(event1[0].substring(0,2));
       int event1StartMin = Integer.parseInt(event1[0].substring(3));
       int event1EndHour = Integer.parseInt(event1[1].substring(0,2));
       int event1EndMin = Integer.parseInt(event1[1].substring(3));

        int event2StartHour = Integer.parseInt(event2[0].substring(0,2));
        int event2StartMin = Integer.parseInt(event2[0].substring(3));
        int event2EndHour = Integer.parseInt(event2[1].substring(0,2));
        int event2EndMin = Integer.parseInt(event2[1].substring(3));

        int event1StartTime = event1StartHour*60+ event1StartMin;
        int event1EndTime = event1EndHour*60+ event1EndMin;
        int event2StartTime = event2StartHour*60+ event2StartMin;
        int event2EndTime = event2EndHour*60+ event2EndMin;


      for(int i = event1StartTime;i<=event1EndTime;i++){

         if(i>=event2StartTime&&i<=event2EndTime){
          return true;
          }

      }
      return false;
    }
    public static void main(String[] args){

     DetermineifTwoEventsHaveConflict2446 twoEventsConflict=new DetermineifTwoEventsHaveConflict2446();
    /* String[] event1 = {"01:15","02:00"};
     String[] event2 = {"02:00","03:00"};*/

        String[] event1 = {"14:13","22:08"};
        String[] event2 = {"02:40","08:08"};
    boolean output = twoEventsConflict.haveConflict(event1,event2);
    System.out.println("output"+output);
    }
}
