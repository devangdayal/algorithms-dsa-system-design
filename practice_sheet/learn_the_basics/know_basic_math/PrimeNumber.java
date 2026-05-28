public class PrimeNumber {

    private void findPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }

        System.out.println(count == 2
                ? "Prime Number"
                : "Not a Prime Number.");
    }

    static void main(String[] args) {
        int n = 19;

        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.findPrime(n);
    }
}
