public class SearchXRotatedArray_I {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        SearchXRotatedArray_I searchXRotatedArrayI = new SearchXRotatedArray_I();
        System.out.println(searchXRotatedArrayI.search(nums, target));
    }

    public int search(int[] nums, int target) {

        int pivot = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                pivot = i;
                break;
            }
        }

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        int r1 = binarySearch(nums, 0, pivot - 1, target);

        if (r1 != -1) {
            return r1;
        }

        return binarySearch(nums, pivot, nums.length - 1, target);
    }

    public int binarySearch(int[] arr, int l, int r, int target) {

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}