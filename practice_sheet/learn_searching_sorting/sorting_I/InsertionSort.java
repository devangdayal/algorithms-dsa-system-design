import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 3, 3213, -42, 42, 1, 487};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(numbers);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
