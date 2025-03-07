package Arrays;

import java.util.Arrays;

public class CopyArray {
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copy = copyArray(original);
        System.out.println(Arrays.toString(copy));
    }
}

