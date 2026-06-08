import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderArray {

    public Object[] arrayLeader(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = nums[n - 1];
        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] >= maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(leaders);

        return leaders.toArray();


    }


    static void main(String[] args) {
        int[] number_1 = {16, 17, 4, 3, 5, 2};
        int[] number_2 = {5, 4, 3, 2, 1};
        int[] number_3 = {10, 22, 12, 3, 0, 6};

        LeaderArray leaderArray = new LeaderArray();

        System.out.println(Arrays.toString(leaderArray.arrayLeader(number_1)));
        System.out.println(Arrays.toString(leaderArray.arrayLeader(number_2)));
        System.out.println(Arrays.toString(leaderArray.arrayLeader(number_3)));

    }
}
