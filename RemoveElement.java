package Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] arr, int value) {
        return Arrays.stream(arr).filter(num -> num != value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = removeElement(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

