import java.util.Arrays;

public class NMMatrixTranspose {

    public int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                result[c][r] = matrix[r][c];
            }
        }
        return result;
    }


    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4,5,6}, {7,8,9},{10,11,12}};

        NMMatrixTranspose nmMatrixTranspose = new NMMatrixTranspose();
        System.out.println(Arrays.deepToString(nmMatrixTranspose.transpose(matrix)));
    }
}
