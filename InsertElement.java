package Arrays;

import java.util.Arrays;

public class InsertElement {
    public static int[] insertAt(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            newArr[i] = (i == index) ? value : arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        arr = insertAt(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }
}
