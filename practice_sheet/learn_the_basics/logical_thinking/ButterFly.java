public class ButterFly {

    private void printHollowFilledStar(int n) {

        // upper half
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        ButterFly pattern = new ButterFly();
        pattern.printHollowFilledStar(n);
    }
}
