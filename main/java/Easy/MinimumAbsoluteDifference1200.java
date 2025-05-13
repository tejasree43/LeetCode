package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifference1200 {


    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<Integer> numbers = null;
        Arrays.sort(arr);
        int min =arr[arr.length-1];
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if (Math.abs(arr[i+1]-arr[i])<min) {
                min = Math.abs(arr[i+1]-arr[i]);
            }
        }
        int i=0;int j=0;
        while(i<n-1){
            int value1=arr[i];
            int value2=arr[i+1];

            if(Math.abs(arr[i+1]-arr[i])==min){
                System.out.println(arr[i] +" "+arr[i+1]);
                numbers=new LinkedList<>();
                numbers.add(arr[i]);
                numbers.add(arr[i+1]);
                result.add(new LinkedList<>(numbers));
            }
            i++;
        }

        System.out.println("numbers"+result);


       // numbers.stream().forEach(s->System.out.println(s));

        System.out.println("minimum difference" + min);


        return result;
    }


    public static void main(String[] args){
        MinimumAbsoluteDifference1200 minimumDifference=new MinimumAbsoluteDifference1200();
        int[] arr={1,3,6,10,15};
        minimumDifference.minimumAbsDifference(arr);
    }
}
