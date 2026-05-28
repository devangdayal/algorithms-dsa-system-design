// 1800. Maximum Ascending Subarray Sum

// Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

// A subarray is defined as a contiguous sequence of numbers in an array.

class MaxArraySumAscending{
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currMax = nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i] > nums[i-1]){
                currMax +=nums[i];
            }else{
                currMax = nums[i];
            }

            maxSum = Math.max(currMax,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxArraySumAscending maxArraySumAscending = new MaxArraySumAscending();
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxArraySumAscending.maxAscendingSum(nums));
    }
}