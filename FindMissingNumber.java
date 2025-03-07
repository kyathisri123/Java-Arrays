package Arrays;

public class FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return sum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[99]; 
        int missingNumber = 37;  
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                arr[index++] = i;
            }
        }

        System.out.println("Missing Number: " + findMissing(arr, 100));
    }
}

