package MoovUp;

import Algorithms.SlidingWindow;

public class PossiblePaths {

    public static void main(String[] args)
    {

        int[] n = { 1,9,-1,-2,7,3,-1,2};
        int k=4;
        SlidingWindow sw=new SlidingWindow();
        int output=  sw.maxContiguousArray(n,k);
        System.out.println("output"+output);


    }
}
