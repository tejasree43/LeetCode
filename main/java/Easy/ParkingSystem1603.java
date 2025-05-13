package Easy;

 class ParkingSystem1603 {


     boolean IsAvailableBig=false;
     boolean IsAvailableMedium=false;
     boolean IsAvailableSmall=false;
     int  bigCar=1;
     int mediumCar=2;
     int smallCar=3;

     int big=0;
     int medium=0;
     int small=0;


     ParkingSystem1603(int big, int medium, int small) {

         this.big=big;
         this.medium=medium;
         this.small=small;

    }

     public boolean addCar(int carType) {

         if(carType==bigCar&&big>0)
         {
             big--;
             return true;
         }
         else if(carType==mediumCar&&medium>0){
             medium--;
             return true;
         }
         else if(carType==smallCar&&small>0){
             small--;
             return true;
         }
         else{
            return  false;
         }

     }

    public static void main(String[] args){
        ParkingSystem1603 obj = new ParkingSystem1603(1, 1, 0);
        boolean bigOutput= obj.addCar(1);
        System.out.println("bigOutput"+bigOutput);
        boolean medOutput= obj.addCar(2);
        System.out.println("medOutput"+medOutput);
        boolean smallOutput= obj.addCar(3);
        System.out.println("smallOutput"+smallOutput);
        boolean output4= obj.addCar(1);
        System.out.println("output4="+output4);
    }

}
