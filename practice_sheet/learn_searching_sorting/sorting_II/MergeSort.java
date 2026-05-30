import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        mergeArray(nums, left, mid, right);
    }

    private void mergeArray(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        System.arraycopy(temp, 0, nums, left + 0, temp.length);

    }

    public static void main(String[] args) {
        int[] numbers = {12, 3, 3213, -42, 42, 1, 487};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(numbers, 0, numbers.length - 1);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
