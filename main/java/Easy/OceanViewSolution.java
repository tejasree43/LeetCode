package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class OceanViewSolution {

    public static int[] buildingViews(int[] inputs, int currentHeight) {
        ArrayList<Integer> al = new ArrayList();
        for (int i = inputs.length - 1; i >= 0; i--) {
            System.out.println("currentHeight=" + currentHeight);
            System.out.println("inputs[i]=" + inputs[i]);

            if (inputs[i] > currentHeight) {
                System.out.println("for loop number" + i);
                al.add(i);
                currentHeight = inputs[i];
            }
        }
        al.add(inputs.length - 1);

        System.out.print("size" + al.size());
        int[] ans = new int[al.size()];
        int f = 0;
        for (int k = 0; k < al.size(); k++) {
            ans[f++] = al.get(k);
        }

        System.out.println("al" + al);

        return ans;
    }

    public static void main(String args[]) {

        int[] oceanBuildings = {1, 3, 2, 4};
        int length = oceanBuildings.length;
        int firstBuildingHeight = oceanBuildings[length - 1];
        int[] output = OceanViewSolution.buildingViews(oceanBuildings, firstBuildingHeight);
        Arrays.stream(output).sorted().forEach(s -> System.out.println(s));

        //{1,3,2,4}={3}
        //{4,2,3,1}={0,2,3}
        //{4,3,2,1}={0,1,2,3}

    }

}
