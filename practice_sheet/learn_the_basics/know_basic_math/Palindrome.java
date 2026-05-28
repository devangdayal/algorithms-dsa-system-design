public class Palindrome {

    static void main(String[] args) {

        int number = 1221 ;
        int original = number;
        int reverseNumber = 0;

        while(number>0){
            int lastDigit = number %10;
            reverseNumber = reverseNumber *10 + lastDigit;
            number /=10;
        }

        if(original == reverseNumber){
            System.out.println("Palindrome is True.");
        }else{
            System.out.println("Not a Palindrome.");
        }
    }
}
