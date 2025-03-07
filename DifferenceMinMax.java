package Arrays;

import java.util.Arrays;

public class DifferenceMinMax {
    public static int findDifference(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        System.out.println("Difference: " + findDifference(arr));
    }
}

