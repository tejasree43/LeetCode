package Design;

import Easy.DesignHashMap706;

import java.util.ArrayList;
import java.util.List;

class Pair{

   int key;
   int value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Pair(int key, int value){
    this.key=key;
     this.value=value;
    }
}
public class DesignHashMap {

    List<Pair>[] listArray;
    public DesignHashMap() {
        listArray = new List[100];
        for(int i =0;i<listArray.length;i++){
            listArray[i]=new ArrayList<>();
        }
    }

    public void put(int key, int value) {

        int Index = key % 100;
        List<Pair> putList = listArray[Index];
        boolean valueReplaced = false;
        for (int i = 0; i < putList.size(); i++) {

            Pair currentPair = putList.get(i);

            if (key == currentPair.getKey()) {
                currentPair.setValue(value);
            }
            valueReplaced = true;
        }

        if (!valueReplaced) {
            putList.add(new Pair(key, value));
        }
    }

    public int get(int key) {
        int Index = key % 100;
        List<Pair> putList = listArray[Index];
        for (int i = 0; i < putList.size(); i++) {
            Pair currentPair = putList.get(i);
            if (key == currentPair.getKey()) {
                return  currentPair.getValue();
            }
         }

        return -1;
    }

    public void remove(int key) {
        int Index = key % 100;
        List<Pair> putList = listArray[Index];
        for (int i = 0; i < putList.size(); i++) {
            Pair currentPair = putList.get(i);
            if (key == currentPair.getKey()) {
                putList.remove(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        DesignHashMap myHashMap = new DesignHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(1, 3); // The map is now [[1,1],
        // myHashMap.print();
        int getValue  = myHashMap.get(0); // The map is now [[1,1],
        System.out.println("getValue"+getValue);

    }
}