import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] nums, int low, int high){
        int n = nums.length;
        if(low<high){
            int pivot = partition(nums,low,high);
            quickSort(nums,low,pivot-1);
            quickSort(nums, pivot+1, high);
        }
    }


    public int partition(int[] nums, int low, int high){
        int pivot = nums[high];

        int i = low-1;
        for(int j = low;j<=high-1;j++){
            if(nums[j] < pivot){
                i++;
                Swap.swap(nums,i,j);
            }
        }

        Swap.swap(nums,i+1,high);
        return i+1;
    }


    public static void main(String[] args) {
        int[] numbers = {12, 3, 3213, -42, 42, 1, 487};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers,0,numbers.length-1);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
