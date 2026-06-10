import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, -1, -4};

        ThreeSum threeSum = new ThreeSum();

        System.out.println(threeSum.threeSum(numbers));
        int k =0;
        System.out.println("Target "+k+" "+threeSum.threeSum(numbers,k));
        k =2;
        System.out.println("Target "+k+" "+threeSum.threeSum(numbers,k));

    }


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();
        int n = nums.length;
        for (int n1 = 0; n1 < n; n1++) {
            if (n1 > 0 && nums[n1] == nums[n1 - 1]) {
                continue;
            }
            int n2 = n1 + 1;
            int n3 = n - 1;

            while (n2 < n3) {
                int sum = nums[n1] + nums[n2] + nums[n3];
                if (sum == 0) {
                    threeSum.add(Arrays.asList(nums[n1], nums[n2], nums[n3]));
                    n2++;
                    n3--;
                    while (n2 < n3 && nums[n3] == nums[n3 + 1]) {
                        n3--;
                    }
                } else if (sum < 0) {
                    n2++;
                } else {
                    n3--;
                }
            }
        }

        return threeSum;
    }


    public List<List<Integer>> threeSum(int[] nums, int k) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == k) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    left++;
                    right--;

                    while (left < right &&
                            nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                            nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < k) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return result;
    }

}
