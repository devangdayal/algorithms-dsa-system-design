import java.util.Arrays;
import java.util.HashSet;

public class SetZeroes {

    public void setMatrixZero(int[][] matrixZero){

        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        int row = matrixZero.length;
        int col = matrixZero[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(matrixZero[r][c] == 0){
                    rowSet.add(r);
                    colSet.add(c);
                }
            }
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(rowSet.contains(r) || colSet.contains(c)){
                    matrixZero[r][c] = 0;
                }
            }
        }

    }


    static void main(String[] args) {

        int[][] matrixZero = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};


        SetZeroes setZeroes= new SetZeroes();
        setZeroes.setMatrixZero(matrixZero);

        System.out.println(Arrays.deepToString(matrixZero));



    }
}
