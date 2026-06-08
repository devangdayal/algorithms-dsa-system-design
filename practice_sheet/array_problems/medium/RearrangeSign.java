import java.util.Arrays;

public class RearrangeSign {

    public int[] rearrangeSignArray(int[] nums) {

        int n = nums.length;
        int[] resultArray = new int[n];

        int positiveIndex = 0, negativeIndex = 1;


        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                resultArray[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                resultArray[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return resultArray;
    }

    static void main(String[] args) {

        int[] numbers = {-1,2,-3,4,5,-6,7,8,-9,-11};
        RearrangeSign rearrangeSign = new RearrangeSign();
        System.out.println(Arrays.toString(rearrangeSign.rearrangeSignArray(numbers)));


    }
}
