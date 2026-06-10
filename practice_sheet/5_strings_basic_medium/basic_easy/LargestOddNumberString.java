public class LargestOddNumberString {

    public String largestOddNumberString(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int digit =num.charAt(i)-'0';
            if(digit%2!=0){
                return num.substring(0,i+1);
            }

        }
        return "";
    }

    static void main(String[] args) {
        String n1 = "12345";
        String n2 = "1234";
        String n3 = "001234500";

        LargestOddNumberString largestOddNumberString = new LargestOddNumberString();
        System.out.println(largestOddNumberString.largestOddNumberString(n1));
        System.out.println(largestOddNumberString.largestOddNumberString(n2));
        System.out.println(largestOddNumberString.largestOddNumberString(n3));


    }
}
