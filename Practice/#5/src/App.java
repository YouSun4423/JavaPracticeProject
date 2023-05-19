public class App {
    public static void main(String[] args) throws Exception {
        int[][] numMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int row = numMatrix.length;
        int col = numMatrix[0].length;
        displayMatrix(numMatrix, row, col);
        System.out.println("");
        int[][] TMatrix = transpose(numMatrix, col, row);
        int Trow = TMatrix.length;
        int Tcol = TMatrix[0].length;


        displayMatrix(TMatrix, col, row);
        System.out.println("");
        displayMatrix(product(numMatrix, TMatrix), row, Tcol);
        System.out.println("");
        displayMatrix(product(TMatrix, numMatrix), Trow, col);
    }

    static int[][] transpose(int[][] matrix, int row, int col){
        int[][] transposeMatrix = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }

    static int[][] product(int[][] m1, int[][] m2){
        int[][] productMatrix = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    productMatrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        return productMatrix;
    }

    static void displayMatrix(int[][] matrix, int row, int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
