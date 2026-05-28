public class SpectrumRectangle {


    private void printSpectrumRectangle(int n) {
        int size = n * 2 - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int top = i;
                int left = j;

                int bottom = size - i + 1;
                int right = size - j + 1;
                int min = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                System.out.print((n - min + 1) + " ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        int n = 5;

        SpectrumRectangle spectrumRectangle = new SpectrumRectangle();
        spectrumRectangle.printSpectrumRectangle(n);
    }
}
