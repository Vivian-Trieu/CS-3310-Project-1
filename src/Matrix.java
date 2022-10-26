public class Matrix {
    public static void main(String[] args) {
        int n = 2;
        int row1 = n, col1 = n, row2 = n, col2 = n;

        int[][] firstMatrix = {{1, 1},
                               {2, 2}};

        int[][] secondMatrix = {{1, 1},
                                {2, 2}};
        
        runClassicalMatrix(row1, col1, firstMatrix, row2, col2, secondMatrix);                       
    }

    private static void runClassicalMatrix (int row1, int col1, int[][] firstMatrix, 
    int row2, int col2, int[][] secondMatrix){
        // Start timer
        long startTime = System.currentTimeMillis();
        
        // Classical Matrix                        
        classicalMatrix classicalMatrix = new classicalMatrix();                         
        classicalMatrix.multiplyMatrix(row1, col1, firstMatrix, row2, col2, secondMatrix);

        // End timer
        long endTime = System.currentTimeMillis();

        // Calculate time to execute program
        long totalTime = endTime - startTime;
        System.out.println("Total Time to Execute Program (in milliseconds): " + totalTime);
    }
}
