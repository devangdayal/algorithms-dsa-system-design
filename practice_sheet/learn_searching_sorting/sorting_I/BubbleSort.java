import java.util.Arrays;

public class BubbleSort {

    public void bubbleSorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    Swap.swap(nums,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
       int[] numbers = {12,3,3213,-42,42,1,487};

       BubbleSort bubbleSort = new BubbleSort();
       bubbleSort.bubbleSorting(numbers);
       Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
