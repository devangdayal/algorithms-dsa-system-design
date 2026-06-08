import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SpiralMatrix {

    public List<Integer> printSpiralMatrix(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int totalN = row * col;
        int left = 0, up = 0;
        int right = col - 1, down = row - 1;

        while (result.size() < totalN) {

            for (int c = left; c <= right; c++) {
                result.add(matrix[up][c]);
            }

            for (int r = up + 1; r <= down; r++) {
                result.add(matrix[r][right]);
            }

            if (up != down) {
                for (int c = right - 1; c >= left; c--) {
                    result.add(matrix[down][c]);
                }
            }
            if (left != right) {
                for (int r = down - 1; r > up; r--) {
                    result.add(matrix[r][left]);
                }
            }

            left++;
            right--;
            up++;
            down--;
        }

        return result;

    }

    static void main(String[] args) {
        int[][] numbers_1 = {{1,2,3}, {4,5,6}, {7,8,9},{10,11,12}};
        int[][] numbers_2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.printSpiralMatrix(numbers_1));
        System.out.println(spiralMatrix.printSpiralMatrix(numbers_2));

    }
}
