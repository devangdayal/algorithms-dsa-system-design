// Shortest Way to count digits in Numbers

//Initialise a variable to store the count of digits of the number.
//The count of digits can be calculated using log10 N + 1.
//log10 N operation gives the logarithmic base 10 of which returns the power to which 10 must be raised to, to be equal to N.
//We add 1 to the result which accounts for the possibility that N itself is a power of 10.
//Financially cast the result to an integer to ensure that it is rounded down to the nearest whole number.
//Return the value of count which represents the count of digits in the input integer N
public class CountDigit{

    public static void main(String[] args) {
        int numbers = 123187614;
        int cnt = (int) Math.log10(numbers) +1;
        System.out.println("Count of the Digits "+ cnt);
    }
}