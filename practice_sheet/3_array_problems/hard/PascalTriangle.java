import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);


        for (int i = 1; i < numRows; i++) {

            List<Integer> prev = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public

    static void main(String[] args) {
        int numRows = 5;
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.pascalTriangle(numRows));
        numRows = 1;
        System.out.println(pascalTriangle.pascalTriangle(numRows));
        numRows = 10;
        System.out.println(pascalTriangle.pascalTriangle(numRows));

    }
}
