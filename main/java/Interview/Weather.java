package Interview;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    String place;

    public String getPlace() {
        return place;
    }


    public Double getTemparature() {
        return temparature;
    }

   /* public String toString() {
        return new StringBuffer( "Weather{" +
                "place='" + place + '\'' +
                ", temparature=" + temparature +
                '}';
    }*/

    Double temparature;

    public Weather(){

    }



    public Weather(String place,Double temparature){


        this.place = place ;
        this.temparature = temparature;
    }

    public static void main(String[] args){
List<Weather> weathers = new ArrayList<>();

        weathers.add(new Weather("Sunny",33.0));
        weathers.add(new Weather("Rainy",17.0));
        weathers.add(new Weather("Cloudy",23.0));
        weathers.add(new Weather("Cold",3.0));
        weathers.add(new Weather("Hot",37.0));
        weathers.add(new Weather("Windy",13.0));
        weathers.add(new Weather("snow",0.0));
        weathers.add(new Weather("freez",-15.0));



        weathers.stream().map(Weather::getTemparature).sorted((p1,p2)->p1.compareTo(p2)).forEach(System.out::println);

    }

}
