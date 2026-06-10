import java.util.Arrays;

public class RotateArrayK {

    public void rotateArrayByK(int[] num, int k) {

        int n = num.length;
        if (n == 0) return;

        // If k > n, rotating n times gives same array
        k = k % n;

        // No rotation needed
        if (k == 0) {
            return;
        }

        // Store last k elements temporarily
        int[] diff = new int[k];

        for (int i = 0; i < k; i++) {
            diff[i] = num[n - k + i];
        }

        // Shift remaining elements to right by k
        // Start from end to avoid overwriting values
        int i = n - k - 1;
        while (i >= 0) {
            num[i + k] = num[i];
            i--;
        }

        // Put saved last k elements at beginning
        for (int x = 0; x < k; x++) {
            num[x] = diff[x];
        }
    }

    static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 6;

        RotateArrayK rotateArrayK = new RotateArrayK();
        rotateArrayK.rotateArrayByK(numbers, k);

        // Output after rotation
        System.out.println(Arrays.toString(numbers));
    }
}