public class PrintDivisor {

    private void divisors(int n){

        for(int i=1;i*i<=n;i++){
            if(n%i ==0){
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }

    static void main(String[] args) {
        int n = 36;

        PrintDivisor printDivisor = new PrintDivisor();
        printDivisor.divisors(n);
    }
}
