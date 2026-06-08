import java.util.Arrays;

public class FirstLastOccurrence {

    static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FirstLastOccurrence firstLastOccurrence = new FirstLastOccurrence();
        System.out.println(Arrays.toString(firstLastOccurrence.firstLastOccurrence(numbers, target)));
    }

    public int[] firstLastOccurrence(int[] nums, int target) {
        return new int[]{firstOccurrence(nums, target), lastOccurrence(nums, target)};
    }

    private int firstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private int lastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

}
