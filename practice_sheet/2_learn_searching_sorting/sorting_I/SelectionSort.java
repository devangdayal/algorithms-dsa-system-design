import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int key = i;
            for(int j=i+1;j<n;j++){
                if(nums[key] > nums[j]){
                    key = j;
                }
            }
            Swap.swap(nums,key,i);
        }
    }

        public static void main(String[] args) {
        int[] numbers = {12,0,012,0123, 3, 323, -42, 22, 1, 7};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(numbers);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
