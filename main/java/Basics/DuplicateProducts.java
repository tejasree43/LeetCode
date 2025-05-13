package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class obj{
String name;
int price;
int weight;

    obj(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public boolean isDuplicate(obj x)
    {
        if(this.name.equals(x.name)&&this.price==x.price&&this.weight==x.weight){
            return true;
        }
        return false;
    }



}

public class DuplicateProducts {
    //O(n^2) time complexity
    private static int numDuplicates(List<String> nameList, List<Integer> priceList, List<Integer> weightList) {

        List<obj> objectList=new ArrayList<>();
        for(int i=0;i<nameList.size();i++){
            objectList.add(new obj(nameList.get(i),priceList.get(i),weightList.get(i)));
        }
        int duplicateCount=0;
        int i=0;int j=0;
        while(i<objectList.size()){
            j=0;

            while(j<objectList.size()){
                if(i!=j&&objectList.get(i).isDuplicate(objectList.get(j))){
                    duplicateCount++;
                    objectList.remove(objectList.get(i));
                }
                j++;
            }
            i++;
        }

        System.out.println("objectList"+objectList.size());
        objectList.stream().forEach(s->System.out.println(s.name+" "+s.price+" "+s.weight));
        return duplicateCount;
    }

    public static void main(String[] args){

       String[] name={"ball","box","ball","ball","box"};
       List<String> nameList=new ArrayList<>(Arrays.asList(name));
        Integer[] price={2,2,2,2,2};
        List<Integer> priceList=new ArrayList<>(Arrays.asList(price));
        Integer[] weight={1,2,1,1,3};
        List<Integer> weightList=new ArrayList<>(Arrays.asList(weight));

       int duplicateCount= numDuplicates(nameList,priceList,weightList);
       System.out.println("duplicateCount"+duplicateCount);

    }


}
