import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {

    static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 2, -1, -4};

        ThreeSumZero threeSumZero = new ThreeSumZero();

        System.out.println(threeSumZero.threeSumZero(numbers));
    }


    public List<List<Integer>> threeSumZero(int[] nums) {

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
}
