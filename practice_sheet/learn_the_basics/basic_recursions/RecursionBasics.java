import java.util.Arrays;

public class RecursionBasics {

    public void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        n--;
        printNTo1(n);
    }

    public void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n-1);
        System.out.print(n + " ");

    }

    public void sumN(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sumN(n-1,sum+n);
    }

    public void factorialN(int n, int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        factorialN(n-1, fact*n);
    }

    public void reverseArray(int[] numbers,int left, int right){
        if(left>=right){
            return;
        }
        int temp = numbers[left];
        numbers[left]=numbers[right];
        numbers[right] = temp;
        reverseArray(numbers,left+1,right-1);
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

    public static void main(String[] args) {
        int n = 5;

        RecursionBasics recursionBasics = new RecursionBasics();

        System.out.println("N to 1: ");
        recursionBasics.printNTo1(n);
        System.out.println("\n=========");

        System.out.println("1 to N: ");
        recursionBasics.print1ToN(n);
        System.out.println("\n=========");

        System.out.println("Sum of "+ n +" : ");
        recursionBasics.sumN(n,0);
        System.out.println("=========");

        System.out.println("Factorial of "+ n +" : ");
        recursionBasics.factorialN(n,1);
        System.out.println("=========");


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array of "+ Arrays.toString(numbers));
//      Arrays.stream(numbers).forEach(System.out::println);
        recursionBasics.reverseArray(numbers,0,numbers.length-1);
        System.out.println("Reverse of Array : "+ Arrays.toString(numbers));
        System.out.println("=========");


        String str = "Racecar";
        System.out.println("Is "+str+" a palindrome?");
        recursionBasics.palindromeFlag(str.toLowerCase(),0,str.length()-1);
        System.out.println("=========");

        System.out.println("Fibonacci Series for "+n+": ");
        recursionBasics.printFibonacciSeries(n);
        System.out.println("\n=========");

    }
}
