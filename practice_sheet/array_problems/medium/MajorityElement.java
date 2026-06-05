public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;


        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

    }

    static void main(String[] args) {
        int[] nums = {3, 4, 4, 4, 4, 4, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();

        System.out.println(majorityElement.majorityElement(nums));
    }
}
