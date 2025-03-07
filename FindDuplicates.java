package Arrays;

import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) System.out.println("Duplicate: " + num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 4};
        findDuplicates(arr);
    }
}

