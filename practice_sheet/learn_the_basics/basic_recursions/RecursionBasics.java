import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RecursionBasics {

    public void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        n--;
        printNTo1(n);
    }

    public void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n + " ");

    }

    public void sumN(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumN(n - 1, sum + n);
    }

    public void factorialN(int n, int fact) {
        if (n == 1) {
            System.out.println(fact);
            return;
        }
        factorialN(n - 1, fact * n);
    }

    public void reverseArray(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = numbers[left];
        numbers[left] = numbers[right];
        numbers[right] = temp;
        reverseArray(numbers, left + 1, right - 1);
    }

    public void palindromeFlag(String str, int left, int right) {
        if (left >= right) {
            System.out.println("Is a Palindrome.");
            return;
        }
        if (str.charAt(left) != str.charAt(right)) {
            System.out.println("Not a Palindrome.");
            return;
        }
        palindromeFlag(str, left + 1, right - 1);
    }

    public void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public void frequencyArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void highestFrequencyArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Count frequencies
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }


    public static void main(String[] args) {
        int n = 5;

        RecursionBasics recursionBasics = new RecursionBasics();

        System.out.println("N to 1: ");
        recursionBasics.printNTo1(n);
        System.out.println("\n=========");

        System.out.println("1 to N: ");
        recursionBasics.print1ToN(n);
        System.out.println("\n=========");

        System.out.println("Sum of " + n + " : ");
        recursionBasics.sumN(n, 0);
        System.out.println("=========");

        System.out.println("Factorial of " + n + " : ");
        recursionBasics.factorialN(n, 1);
        System.out.println("=========");


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array of " + Arrays.toString(numbers));
//      Arrays.stream(numbers).forEach(System.out::println);
        recursionBasics.reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reverse of Array : " + Arrays.toString(numbers));
        System.out.println("=========");


        String str = "Racecar";
        System.out.println("Is " + str + " a palindrome?");
        recursionBasics.palindromeFlag(str.toLowerCase(), 0, str.length() - 1);
        System.out.println("=========");

        System.out.println("Fibonacci Series for " + n + ": ");
        recursionBasics.printFibonacciSeries(n);
        System.out.println("\n=========");


        int[] numbers2 = {10, 5, 10, 15, 10, 5};
        System.out.println("Frequency of Element in the array:  " + Arrays.toString(numbers));
        recursionBasics.frequencyArray(numbers2);
        System.out.println("=========");


        System.out.println("Highest Frequency Element in the array:  " + Arrays.toString(numbers));
        recursionBasics.highestFrequencyArray(numbers2);
        System.out.println("=========");

    }
}
