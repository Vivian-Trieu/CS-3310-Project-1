public class strassenMatrix {
    /**
     * Strassen's Matrix Multiplication Implementation
     * @param A
     * @param B
     * @return Product Matrix C
     */
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

        // Divide Matrix A into 4 halves
        split(A, A11, 0, 0);
        split(A, A12, 0, n/2);
        split(A, A21, n/2, 0);
        split(A, A22, n/2, n/2);

        // Divide Matrix B into 4 halves
        split(B, B11, 0, 0);
        split(B, B12, 0, n/2);
        split(B, B21, n/2, 0);
        split(B, B22, n/2, n/2);

        // Follow Algorithm
        int[][] M1 = multiplyMatrix(add(A11, A22), add(B11, B22));
    }

    /**
     * Function to split parent matrix into child matrices
     * @param P
     * @param C
     * @param iB
     * @param jB
     */
    public void split (int[][] P, int[][] C, int iB, int jB) {
    
        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++) {

            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++) {

                C[i1][j1] = P[i2][j2];
            }
        }
    }

    /**
     * Function to add two matrices
     * @param A
     * @param B
     * @return Sum Matrix C
     */
    public int[][] add(int[][] A, int[][] B) {

        int n = A.length;
         
        // Sum Matrix
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
}
