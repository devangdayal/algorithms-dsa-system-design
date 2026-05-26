package Arrays;
// 53. Maximum Subarray - Medium
// Given an integer array nums, find the subarray with the largest sum, and return its sum.


public class KadaneAlgo_MaxSumArray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadane(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }


    public static int kadane(int[] arr) {
        int maxCurrent = arr[0];
        int maxGlobal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        return maxGlobal;
    }
    
}
