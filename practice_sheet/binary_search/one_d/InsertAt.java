public class InsertAt {

    static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 5;
        InsertAt insertAt = new InsertAt();
        System.out.println(insertAt.findPositionAt(numbers, target));
    }

    public int findPositionAt(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] >= target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
