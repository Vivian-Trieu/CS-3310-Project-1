public class strassenMatrix {
    public int[][] multiplyMatrix (int [][] A, int[][] B){
        int n = A.length;
        
        // Matrix to store product
        int[][] C = new int[n][n];

        // Divide Matrix into parts by storing sub-parts into variables
        int[][] A11 = new int [n/2][n/2];
        int[][] A12 = new int [n/2][n/2];
        int[][] A21 = new int [n/2][n/2];
        int[][] A22 = new int [n/2][n/2];
        int[][] B11 = new int [n/2][n/2];
        int[][] B12 = new int [n/2][n/2];
        int[][] B21 = new int [n/2][n/2];
        int[][] B22 = new int [n/2][n/2];

        return R;
    }
}
