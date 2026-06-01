import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroesToEnd(int[] nums) {
        int n = nums.length;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                Swap.swap(nums, zero, i);
                zero++;
            }
        }
    }

    static void main(String[] args) {
        int[] numbers = {10, 20, 0, 12, 15, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroesToEnd(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
