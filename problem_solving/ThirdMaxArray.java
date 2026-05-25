// 414. Third Maximum Number

// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.


public class ThirdMaxArray {

    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } else if (third == null || num > third) {
                third = (long) num;
            }
        }

        return third == null ? first.intValue() : third.intValue();

    }
    

    public static void main(String[] args) {
        ThirdMaxArray solution = new ThirdMaxArray();

        int[] nums1 = {3, 2, 1};
        System.out.println(solution.thirdMax(nums1)); 

        int[] nums2 = {1, 2};
        System.out.println(solution.thirdMax(nums2)); 

        int[] nums3 = {2, 2, 3, 1};
        System.out.println(solution.thirdMax(nums3)); 
    }
    
}
