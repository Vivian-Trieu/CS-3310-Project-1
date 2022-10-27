public class Matrix {
    public static void main(String[] args) {
        int n = 4;
        
        int[][] A = {{1, 1, 1, 1},
                     {2, 2, 2, 2},
                     {3, 3, 3, 3},
                     {4, 4, 4, 4}};

        int[][] B = {{1, 1, 1, 1},
                     {2, 2, 2, 2},
                     {3, 3, 3, 3},
                     {4, 4, 4, 4}};
        
        // Print First Matrix
        System.out.println("\nFirst Matrix:");
        printMatrix(A, n);

        // Print Second Matrix
        System.out.println("\nSecond Matrix:");
        printMatrix(B, n);

        runClassicalMatrix(A, B, n);
        runStrassenMatrix(A, B, n);                       
    }

    // Classical Matrix  
    public static void runClassicalMatrix (int[][] A, int[][] B, int n) {
        System.out.println("\nClassical Matrix Multiplication: ");
        // Start timer
        long startTime = System.currentTimeMillis();
                         
        // Calculate Product Matrix
        classicalMatrix cMatrix = new classicalMatrix();                         
        int[][] C = cMatrix.multiplyMatrix(A, B);

        // Print Product
        System.out.println("\nProduct of the Matrices:");
        printMatrix(C, n);

        // End timer
        long endTime = System.currentTimeMillis();

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in milliseconds): " + totalTime);
    }

    // Divide and Conquer Matrix

    // Strassen’s matrix multiplication
    public static void runStrassenMatrix(int[][] A, int[][] B, int n) {
        System.out.println("\nStrassen Matrix Multiplication: ");
        // Start timer
        long startTime = System.currentTimeMillis();

        // Calculate Product Matrix
        strassenMatrix sMatrix = new strassenMatrix();
        int[][] C = sMatrix.multiplyMatrix(A, B);

        // Print Product
        System.out.println("\nProduct of the Matrices:");
        printMatrix(C, n);

        // End timer
        long endTime = System.currentTimeMillis();

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in milliseconds): " + totalTime);
    }

    // Method to print Matrix
    public static void printMatrix(int M[][], int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(M[i][j] + " ");               
            }
            System.out.println();
        }
    }
}
