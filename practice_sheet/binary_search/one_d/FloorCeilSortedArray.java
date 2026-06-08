import java.util.Arrays;

public class FloorCeilSortedArray {

    static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FloorCeilSortedArray floorCeilSortedArray = new FloorCeilSortedArray();
        System.out.println(Arrays.toString(floorCeilSortedArray.floorCeilArray(numbers, target)));
    }

    public int[] floorCeilArray(int[] nums, int target) {
        return new int[]{ceilValue(nums, target), floorValue(nums, target)};
    }

    private int ceilValue(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target){
                ans = nums[mid];
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    private int floorValue(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] <= target){
                ans = nums[mid];
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
