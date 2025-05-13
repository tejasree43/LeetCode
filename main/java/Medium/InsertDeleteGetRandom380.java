package Medium;

import java.util.*;

public class InsertDeleteGetRandom380 {


    List<Integer> list ;
    Set<Integer> set;

    Random rm;
    public InsertDeleteGetRandom380() {
        list= new ArrayList<>();
        set = new HashSet<>();
        rm=new Random();
    }

    public boolean insert(int val) {

        if (!set.contains(val)) {
            set.add(val);
            list.add(val);
            return true;
        } else {
            return false;
        }

    }

    public boolean remove(int val) {
        if (!set.contains(val)) {
            return false;
        } else {
            set.remove(val);
            list.remove(val);
            return true;

        }
    }

    public int getRandom() {

       int index =rm.nextInt(set.size());
        return list.get(index);
    }
    public static void main(String[] args)
    {
        InsertDeleteGetRandom380 randomizedSet = new InsertDeleteGetRandom380();
       boolean insert1= randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        System.out.println("2 insert is = "+insert1);
        boolean remove2=  randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        System.out.println("2 remove is = "+remove2);

        boolean insert = randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        System.out.println("2 insert is = "+insert);

        int random1 = randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        System.out.println("random = "+random1);

       boolean removeOutput =randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        System.out.println("remove 1  = "+removeOutput);
        boolean insertInput = randomizedSet.insert(2); // 2 was already in the set, so return false.
        System.out.println("insert 2 = "+insertInput);
        int RandomNext = randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
        System.out.println("getRandom = "+RandomNext);


    }
}
