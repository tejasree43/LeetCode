
public class RemoveDuplicatesDemo {
    public static int removeDuplicates(int array[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n - 1];
        //Changing the original array
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int array[] = {18, 25, 25, 25, 28, 28, 29};
        int length = array.length;
        length = removeDuplicates(array, length);
//Printing The array elements
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }
}