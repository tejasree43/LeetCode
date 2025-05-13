package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KeysandRooms841 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        System.out.println("rooms size = "+rooms.size());
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(rooms,visited,0);

        for (boolean value:visited){

            if(value!=true){
                return false;
            }

        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms,  boolean[] visited , int key) {

        visited[key]= true;

        System.out.println("key"+key);
        for (int room:rooms.get(key)){

            if(visited[room]!=true){
                dfs(rooms,visited,room);
            }

        }


    }

    public static void main(String[] args) {
        List<List<Integer>> roomKeys = new ArrayList<>();

     //   TestCase 1 [[1],[2],[3],[]]
      /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        System.out.println(list);

        roomKeys.add(list);*/

//TestCase 3 [[2],[],[1]]
      /*  List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();

        list2.add(null);
        List<Integer> list3 = new ArrayList<>();

        list3.add(1);
        roomKeys.add(list1);
        roomKeys.add(list2);
        roomKeys.add(list3);
*/


       //  TestCase 2 [[1,3],[3,0,1],[2],[0]]
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(0);
        list2.add(1);
        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        List<Integer> list4 = new ArrayList<>();
        list4.add(0);
        roomKeys.add(list);
        roomKeys.add(list2);
        roomKeys.add(list3);
        roomKeys.add(list4);

        System.out.println(roomKeys);

        KeysandRooms841 keysAndRooms = new KeysandRooms841();
        boolean output = keysAndRooms.canVisitAllRooms(roomKeys);
        System.out.println("output"+output);

    }
    }
