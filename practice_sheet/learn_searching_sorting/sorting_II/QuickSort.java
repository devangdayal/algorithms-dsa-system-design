import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] nums){
        int n = nums.length;


    }


    public static void main(String[] args) {
        int[] numbers = {12, 3, 3213, -42, 42, 1, 487};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
