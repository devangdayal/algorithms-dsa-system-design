public class GCD {

    private void findGCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is : " + gcd);
    }

    private void findGCDShorter(int n1, int n2) {

        int greater = Math.max(n1, n2);
        int lower = Math.min(n1, n2);

        while(lower!=0){
            int remainder = greater % lower;
            greater = lower;
            lower = remainder;
        }

        System.out.println("GCD is: "+ greater);

    }

    public static void main(String[] args) {

        int n1 = 80;
        int n2 = 15;
        GCD gcd = new GCD();

        gcd.findGCD(n1, n2);
        gcd.findGCDShorter(n1,n2);
    }
}
