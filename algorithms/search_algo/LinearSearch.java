

public class LinearSearch {

    private static int linearSearch(int[] arr, int target) {

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                return idx;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] targets = { 2, 5, 11, 1000, 2000 };

        long startTime = System.nanoTime();

        for (int target : targets) {

            int result = linearSearch(arr, target);
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }

        long endTime = System.nanoTime();

        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000_000.0 + " seconds");
    }

}
