import java.util.Arrays;

public class NMMatrixReflect {

    public void reflect(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols / 2; c++) {

                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][cols - 1 - c];
                matrix[r][cols - 1 - c] = temp;
            }
        }
    }


    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        NMMatrixReflect nmMatrixReflect = new NMMatrixReflect();
        nmMatrixReflect.reflect(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}


