package Arrays;
// LeetCode - 41. First Missing Positive
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Psuedo Code:
// 1. Find Length of the array, n.
// 2. Iterate through the array and for each element, if it is in the range of 1 to n, swap it with the element at its correct position (i.e., arr[i] should be at index arr[i]-1).
// 3. After the first pass, iterate through the array again and find the first index i where arr[i] is not equal to i+1. The first missing positive integer will be i+1.
// 4. If all elements are in their correct positions, then the first missing positive integer will be n+1.  


class FirstMissingPositiveInteger{


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findFirstMissingPositive(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            while(arr[i] > 0 && arr[i] <= n && arr[arr[i]-1] != arr[i]){
                swap(arr, i, arr[i]-1);
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }



    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        int[] arr3 = {7, 8, 9, 11, 12};
        int[] arr4 = {1, 2, 3, 4, 5};
        int[] arr5 = {2, 3, 4, 5, 6};
        System.out.println(findFirstMissingPositive(arr));
        System.out.println(findFirstMissingPositive(arr2));
        System.out.println(findFirstMissingPositive(arr3));
        System.out.println(findFirstMissingPositive(arr4));
        System.out.println(findFirstMissingPositive(arr5));
    }
}