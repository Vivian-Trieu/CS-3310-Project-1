public class Matrix {
    public static void main(String[] args) {
        int n = 2;
        
        int[][] A = {{1, 1},
                     {2, 2}};

        int[][] B = {{1, 1},
                     {2, 2}};
        
        // Print First Matrix
        System.out.println("\nMatrix A:");
        printMatrix(A, n);

        // Print Second Matrix
        System.out.println("\nMatrix B:");
        printMatrix(B, n);

        runClassicalMatrix(A, B, n);
        runDivideAndConquer(A, B, n);
        runStrassenMatrix(A, B, n);                    
    }

    // Classical Matrix  
    public static void runClassicalMatrix (int[][] A, int[][] B, int n) {
        System.out.println("\nClassic: ");
        // Start timer
        long startTime = System.nanoTime();
                         
        // Calculate Product Matrix
        classicalMatrix cMatrix = new classicalMatrix();                         
        int[][] C = cMatrix.multiplyMatrix(A, B);

        // End timer
        long endTime = System.nanoTime();

        // Print Product
        System.out.println("Product of the Matrices:");
        printMatrix(C, n);

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in nanoseconds): " + totalTime);
    }

    // Divide and Conquer Matrix
    public static void runDivideAndConquer (int[][] A, int[][] B, int n) {
        System.out.println("\nDivide and Conquer: ");
        // Start timer
        long startTime = System.nanoTime();
                         
        // Calculate Product Matrix
        divideAndConquer dncMatrix = new divideAndConquer();                         
        int[][] C = dncMatrix.multiplyMatrix(A, B);

        // End timer
        long endTime = System.nanoTime();

        // Print Product
        System.out.println("Product of the Matrices:");
        printMatrix(C, n);

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in nanoseconds): " + totalTime);
    }

    // Strassen’s matrix multiplication
    public static void runStrassenMatrix(int[][] A, int[][] B, int n) {
        System.out.println("\nStrassen's: ");
        // Start timer
        long startTime = System.nanoTime();

        // Calculate Product Matrix
        strassenMatrix sMatrix = new strassenMatrix();
        int[][] C = sMatrix.multiplyMatrix(A, B);

        // End timer
        long endTime = System.nanoTime();

        // Print Product
        System.out.println("Product of the Matrices:");
        printMatrix(C, n);

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in nanoseconds): " + totalTime);
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
