import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int n = 4;
        // Random r = new Random();
        
        // Generates matrix with random ints
        // int[][] A = createMatrix(n, r, -9, 9);
        // int[][] B = createMatrix(n, r, -9, 9);

        // Sanity check from instructions3170
        int[][] A = {{2, 0, -1, 6},
                      {3, 7, 8, 0},
                      {-5, 1, 6, -2},
                      {8, 0, 1, 7}};

        int[][] B = {{0, 1, 6, 3},
                      {-2, 8, 7, 1},
                      {2, 0, -1, 0},
                      {9, 1, 6, -2}}; 
        
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
    private static void printMatrix(int M[][], int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(M[i][j] + " ");               
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(int n, Random random, int min, int max) {
        int [][] m = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        return m;
    }
}
