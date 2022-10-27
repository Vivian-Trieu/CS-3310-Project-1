public class strassenMatrix {
    /**
     * Strassen's Matrix Multiplication Implementation
     * 
     * @param A
     * @param B
     * @return Product Matrix C
     */
    public int[][] multiplyMatrix(int[][] A, int[][] B) {

        int n = A.length;

        // Matrix to store product
        int[][] C = new int[n][n];

        if (n == 1) 

            C[0][0] = A[0][0] * B[0][0];

        else {
            // Divide Matrix into parts by storing sub-parts into variables
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];

            // Divide Matrix A into 4 halves
            split(A, A11, 0, 0);
            split(A, A12, 0, n / 2);
            split(A, A21, n / 2, 0);
            split(A, A22, n / 2, n / 2);

            // Divide Matrix B into 4 halves
            split(B, B11, 0, 0);
            split(B, B12, 0, n / 2);
            split(B, B21, n / 2, 0);
            split(B, B22, n / 2, n / 2);

            // Follow Algorithm

            // M1 = (A11+A22)x(B11+B22)
            int[][] M1 
            = multiplyMatrix(add(A11, A22), add(B11, B22));

            // M2 = (A21+A22)x(B11)
            int[][] M2 
            = multiplyMatrix(add(A21, A22), B11);

            // M3 = (A11)x(B12-B22)
            int[][] M3 
            = multiplyMatrix(A11, sub(B12, B22));

            // M4 = (A22)x(B21-B11)
            int[][] M4 
            = multiplyMatrix(A22, sub(B21, B11));

            // M5 = (A11+A12)x(B22)
            int[][] M5 
            = multiplyMatrix(add(A11, A12), B22);

            // M6 = (A21-A11)x(B11+B12)
            int[][] M6 
            = multiplyMatrix(sub(A21, A11), add(B11, B12));

            // M7 = (A12-A22)x(B21+B22)
            int[][] M7 
            = multiplyMatrix(sub(A12, A22), add(B21, B22));

            // C11 = M1 + M4 - M5 + M7
            int[][] C11 
            = add(sub(add(M1, M4), M5), M7);

            // C12 = M3 + M5
            int[][] C12 
            = add(M3, M5);

            // C21 = M2 + M4
            int[][] C21 
            = add(M2, M4);

            // C22 = M1 - M2 + M3 + M6
            int[][] C22 
            = add(add(sub(M1, M2), M3), M6);

            // Join 4 halves into one matrix
            join(C11, C, 0, 0);
            join(C12, C, 0, n / 2);
            join(C21, C, n / 2, 0);
            join(C22, C, n / 2, n / 2);
        }

        return C;
    }

    /**
     * Function to split parent matrix into child matrices
     * 
     * @param P
     * @param C
     * @param iB
     * @param jB
     */
    public void split(int[][] P, int[][] C, int iB, int jB) {

        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++) {

            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++) {

                C[i1][j1] = P[i2][j2];
            }
        }
    }

    public void join(int[][] C, int[][] P, int iB, int jB) {

        for (int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++) {

            for (int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++) {

                P[i2][j2] = C[i1][j1];
            }
        }
    }

    /**
     * Function to add two matrices
     * 
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

    /**
     * Function to subtract two matrices
     * 
     * @param A
     * @param B
     * @return Difference Matrix C
     */
    public int[][] sub(int[][] A, int[][] B) {

        int n = A.length;

        // Difference Matrix
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }
}
