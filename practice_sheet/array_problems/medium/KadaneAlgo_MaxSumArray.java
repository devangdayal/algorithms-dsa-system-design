// 53. Maximum Subarray - Medium
// Given an integer array nums, find the subarray with the largest sum, and return its sum.


import java.util.Arrays;

public class KadaneAlgo_MaxSumArray {

    public int maxSumArray(int[] numbers) {
        int maxCurrent = numbers[0], maxGlobal = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            maxCurrent = Math.max(numbers[i], maxCurrent + numbers[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        return maxGlobal;
    }

    public int[] printMaxSumArray(int[] numbers) {
        int maxCurrent = numbers[0], maxGlobal = numbers[0];
        int currentStart = 0, bestStart = 0, bestEnd = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxCurrent + numbers[i]) {
                maxCurrent = numbers[i];
                currentStart = i;
            } else {
                maxCurrent += numbers[i];
            }

            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
                bestStart = currentStart;
                bestEnd = i;
            }
        }
        return Arrays.copyOfRange(numbers, bestStart,bestEnd+1);
    }

    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneAlgo_MaxSumArray kadaneAlgoMaxSumArray = new KadaneAlgo_MaxSumArray();

        System.out.println("Maximum subarray sum is: " + kadaneAlgoMaxSumArray.maxSumArray(arr));
        System.out.println("Maximum subarray sum is: " + Arrays.toString(kadaneAlgoMaxSumArray.printMaxSumArray(arr)));

    }
}
