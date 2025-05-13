package Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pair{

    public int getKey() {
        return key;
    }
    int key;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    int value;
   public Pair(int key,int value)
   {
       this.key=key;
       this.value=value;
   }

}

public class DesignHashMap706 {
    List<Pair>[] arr;
    public DesignHashMap706() {
        arr = new List[100];
        for(int i=0;i<arr.length;i++){
            arr[i] =new ArrayList<>();
        }
    }
    public void put(int key, int value) {

     int index=key %100;
     System.out.println(index+"index");
        List<Pair> list=arr[index];
        boolean IsValueReplaced=false;
        for(int i=0;i<list.size();i++){

            Pair currentpair=list.get(i);
            if(key==currentpair.getKey()){
                 currentpair.setValue(value);
                IsValueReplaced=true;
            }

        }
        if(!IsValueReplaced){
            list.add(new Pair(key,value));
        }

    }

    public int get(int key) {

        int index=key %100;
        System.out.println(index+"index");
        List<Pair> list=arr[index];
        for(int i=0;i<list.size();i++){

            Pair currentpair=list.get(i);
            if(key==currentpair.getKey()){
                return currentpair.getValue();
            }

        }
        return -1;
    }

    public void remove(int key) {
        int index=key %100;
        System.out.println(index+"index");
        List<Pair> list=arr[index];
        for(int i=0;i<list.size();i++){
            Pair currentpair=list.get(i);
            if(key==currentpair.getKey()){
                list.remove(i);
                break;
            }
        }
    }

    public  void print(){

        Arrays.stream(arr).forEach((s)->System.out.println(s));

    }

    public static void main(String[] args){
        DesignHashMap706 myHashMap = new DesignHashMap706();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1],
       // myHashMap.print();
      int getValue  = myHashMap.get(0); // The map is now [[1,1],
        System.out.println("getValue"+getValue);

    }
}
