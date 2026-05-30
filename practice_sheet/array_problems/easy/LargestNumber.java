public class LargestNumber {

    public int largestNumberArray(int[] numbers) {
        int largest = numbers[0];
        for (int num : numbers) {
            largest = Math.max(largest, num);
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = {8, 10, 12, 23, 40, -11, 5, 7, 9,0};

        LargestNumber largestNumber = new LargestNumber();
        System.out.println(largestNumber.largestNumberArray(numbers));
    }
}
