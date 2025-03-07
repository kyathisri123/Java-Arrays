package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - i - 1];
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}

