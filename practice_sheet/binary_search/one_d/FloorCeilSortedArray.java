import java.util.Arrays;

public class FloorCeilSortedArray {

    static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FloorCeilSortedArray floorCeilSortedArray = new FloorCeilSortedArray();
        System.out.println(Arrays.toString(floorCeilSortedArray.floorCeilArray(numbers, target)));
    }

    public int[] floorCeilArray(int[] nums, int target) {
        return new int[]{ceilArray(nums, target), floorArray(nums, target)};
    }

    private int ceilArray(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        int answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] >= target) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return answer;
    }

    private int floorArray(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] <= target) {
                answer = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return answer;
    }
}
