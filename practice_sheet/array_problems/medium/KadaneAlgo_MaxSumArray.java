// 53. Maximum Subarray - Medium
// Given an integer array nums, find the subarray with the largest sum, and return its sum.


public class KadaneAlgo_MaxSumArray {

    public int maxSumArray(int[] numbers) {

        int maxCurrent = numbers[0], maxGlobal = numbers[0];

        for(int i=1;i<numbers.length;i++){
            maxCurrent = Math.max(numbers[i], maxCurrent+numbers[i]);
            maxGlobal = Math.max(maxGlobal,maxCurrent);
        }

        return maxGlobal;

    }

    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneAlgo_MaxSumArray kadaneAlgoMaxSumArray = new KadaneAlgo_MaxSumArray();

        System.out.println("Maximum subarray sum is: " + kadaneAlgoMaxSumArray.maxSumArray(arr));
    }
}
