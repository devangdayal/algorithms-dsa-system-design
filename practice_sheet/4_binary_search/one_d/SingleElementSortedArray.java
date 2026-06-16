public class SingleElementSortedArray {
    public int singleNonDuplicate_ON(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1;) {
            if (nums[i] == nums[i + 1]) {
                i += 2;

            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNonDuplicate_OLogN(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (middle % 2 == 1) {
                middle--;
            }
            if (nums[middle] == nums[middle + 1]) {
                left = middle + 2;
            } else {
                right = middle;
            }

        }
        return nums[left];
    }


    static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,5};

        SingleElementSortedArray singleElementSortedArray = new SingleElementSortedArray();


        System.out.println(singleElementSortedArray.singleNonDuplicate_ON(nums));
        System.out.println(singleElementSortedArray.singleNonDuplicate_OLogN(nums));


    }
}
