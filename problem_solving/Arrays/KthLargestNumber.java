//215. Kth Largest Element in an Array
//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?

import java.util.PriorityQueue;

public class KthLargestNumber {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }


    public static void main(String[] args) {
        int k = 4;
        int[] numbers = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        KthLargestNumber kthLargestNumber = new KthLargestNumber();
        System.out.println(kthLargestNumber.findKthLargest(numbers, k));
    }

}
