import java.util.HashMap;

public class CountSubarraySumK {
    static void main(String[] args) {
        int[] numbers_1 = {1, 2, 3};
        int k_1 = 3;
        int[] numbers_2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k_2 = 15;
        CountSubarraySumK countSubarraySumK = new CountSubarraySumK();
        System.out.println(countSubarraySumK.countSubarraySumK(numbers_1, k_1));
        System.out.println(countSubarraySumK.countSubarraySumK(numbers_2, k_2));
    }


    public int countSubarraySumK(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int countSumK = 0, sum = 0;
        map.put(0,1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - target)) {
                countSumK += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return countSumK;
    }
}
