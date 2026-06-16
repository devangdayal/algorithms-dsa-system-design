public class SearchXRotatedArray_II {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target)
                return true;

            if (nums[middle] == nums[left] && nums[middle] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target >= nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 6, 6, 7, 0, 1, 1, 1, 2, 2, 2, 3, 3,};
        int target = 9;

        SearchXRotatedArray_II searchXRotatedArrayII = new SearchXRotatedArray_II();
        System.out.println(searchXRotatedArrayII.search(nums, target));
    }
}
