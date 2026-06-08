public class LowerUpperBound {

    static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 6;
        LowerUpperBound lowerBound = new LowerUpperBound();
        System.out.println(lowerBound.findLowerBound(numbers, target));
        System.out.println(lowerBound.findUpperBound(numbers, target));
    }

    public int findLowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int bound = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                bound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return bound;
    }

    public int findUpperBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int bound = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                bound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return bound;
    }
}
