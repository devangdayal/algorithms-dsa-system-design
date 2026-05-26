package Strings;
import java.util.Scanner;

public class InvertingCaseViaBits {
    public String toggleCaseViaBits(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isAlphabetic(arr[i])) {
                arr[i] ^= (1 << 5);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        InvertingCaseViaBits invert = new InvertingCaseViaBits();
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to toggle case: ");
            input = scanner.nextLine();
        }
        String toggled = invert.toggleCaseViaBits(input);
        System.out.println("Original: " + input);
        System.out.println("Toggled via Bits: " + toggled);
    }
}
