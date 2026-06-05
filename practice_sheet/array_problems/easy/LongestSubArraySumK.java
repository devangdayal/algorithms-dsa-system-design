import java.util.HashMap;

public class LongestSubArraySumK {

    public int longestSubArraySumToK(int[] nums, int k){

        int countSubArray = 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // Because firstly the prefix sum is zero

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                countSubArray += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }


        return countSubArray;
    }

    static void main(String[] args) {
        int[] numbers = {1,2,3};
        int sum = 3;
        LongestSubArraySumK longestSubArraySumK = new LongestSubArraySumK();
        System.out.println(longestSubArraySumK.longestSubArraySumToK(numbers,sum));

    }
}
