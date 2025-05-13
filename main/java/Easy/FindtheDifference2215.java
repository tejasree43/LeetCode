package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindtheDifference2215 {

 public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

     HashSet<Integer> hSet1 = new HashSet<>();
     HashSet<Integer> hSet2 = new HashSet<>();

     ArrayList<Integer> array1 = new ArrayList<>();
     ArrayList<Integer> array2 = new ArrayList<>();

     List<List<Integer>> answer = new ArrayList<>();

     for(Integer number : nums1){
         hSet1.add(number);
     }
     for(Integer number : nums2){
         hSet2.add(number);
     }
     for(Integer number : hSet1){
         if(!hSet2.contains(number)){
             array1.add(number) ;
         }
     }
     for(Integer number : hSet2){

         if(!hSet1.contains(number)){
             array2.add(number) ;
         }
     }
     answer.add(array1);
     answer.add(array2);
     return answer;
 }
 public static void main(String[] args) {

     FindtheDifference2215 difference = new  FindtheDifference2215();

     int[] nums1 = {1,2,3,3};
     int[] nums2 = {1,1,2,2};
     List<List<Integer>> output = difference.findDifference(nums1,nums2);
     output.stream().forEach(System.out::println);

 }
 }
