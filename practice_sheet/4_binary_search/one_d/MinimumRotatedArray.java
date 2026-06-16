public class MinimumRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 1, 2};

        MinimumRotatedArray minimumRotatedArray = new MinimumRotatedArray();
        System.out.println(minimumRotatedArray.findMinimumRotatedArray(nums));
    }


    public int findMinimumRotatedArray(int[] nums){
        int left =0, right = nums.length-1;
        while(left<right){
            int middle = left + (right-left)/2;

            if(nums[middle] > nums[right]){
                left = middle +1;
            }else{
                right = middle;
            }
        }
        return nums[left];
    }

}
