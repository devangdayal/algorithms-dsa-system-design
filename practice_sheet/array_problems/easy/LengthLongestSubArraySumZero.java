import java.util.HashMap;

public class LengthLongestSubArraySumZero {

    public int lengthLongestSubArraySumZero(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    static void main(String[] args) {
        int[] numbers = {-1, -2, 3};
        LengthLongestSubArraySumZero lengthLongestSubArraySumZero = new LengthLongestSubArraySumZero();
        System.out.println(lengthLongestSubArraySumZero.lengthLongestSubArraySumZero(numbers));

    }

}
