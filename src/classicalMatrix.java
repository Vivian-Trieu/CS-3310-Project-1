public class classicalMatrix {
    /**
     * Classical Matrix Multiplication Implementation
     * @param A
     * @param B
     * @return Product Matrix C
     */
    public int[][] multiplyMatrix(int[][] A, int[][] B) {
        
        int n = A.length;    
        // Matrix to store product
        int[][] C = new int[n][n]; 

        // Multiply 2 Matrices
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;    
    }
}
