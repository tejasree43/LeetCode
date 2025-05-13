package Easy;

public class FindtheHighestAltitude1732 {

    public int largestAltitude(int[] gain) {

        int sum = 0;
        int i =0;
        int highAltitude =0;

        while(i<gain.length){

        sum +=gain[i];
        highAltitude = Math.max(highAltitude,sum);
        i++;
        }

        return highAltitude;
    }
    public static void main(String[] args)
    {
      int[]  gain = {-5,1,5,0,-7};
      FindtheHighestAltitude1732 altitude = new FindtheHighestAltitude1732();
      int output = altitude.largestAltitude(gain);
      System.out.println("output"+output);

    }
}
