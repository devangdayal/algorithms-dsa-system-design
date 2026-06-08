import java.util.Arrays;

public class Rotate90DegreesSquareMatrix {

    public void rotate90DegreesMatrix(int[][] m) {
        transposeMatrix(m);
        reflectMatrix(m);
    }

    private void transposeMatrix(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = m[j][i];
                m[j][i] = m[i][j];
                m[i][j] = temp;
            }
        }
    }

    private void reflectMatrix(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][n - j - 1];
                m[i][n - j - 1] = temp;
            }
        }
    }

    static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Rotate90DegreesSquareMatrix rotate90DegreesSquareMatrixMatrix = new Rotate90DegreesSquareMatrix();
        rotate90DegreesSquareMatrixMatrix.rotate90DegreesMatrix(numbers);

        System.out.println(Arrays.deepToString(numbers));


    }
}
