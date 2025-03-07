package Arrays;

import java.util.Arrays;

public class MinMaxArray {
    public static void findMinMax(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + ", Max: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {15, 3, 7, 9, 20};
        findMinMax(arr);
    }
}

