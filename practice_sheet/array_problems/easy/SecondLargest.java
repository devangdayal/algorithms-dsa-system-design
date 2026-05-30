public class SecondLargest {

    public int secondLargestNumberArray(int[] numbers) {
        return secondLargestNumberArray(numbers, false);

    }
    public int secondLargestNumberArray(int[] numbers, boolean duplicateConsider) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && (num!=largest || duplicateConsider)) {
                secondLargest = num;

            }
        }
        return secondLargest;
    }


    static void main(String[] args) {

        int[] numbers = {8, 10, 12, 23, 40, 40, -11, 5, 7, 9, 0};
        SecondLargest secondLargest = new SecondLargest();

        System.out.println(secondLargest.secondLargestNumberArray(numbers));
        System.out.println(secondLargest.secondLargestNumberArray(numbers,true));
    }
}
