

public class classicalMatrix {
    public void multiplyMatrix(
        int row1, int col1, int[][] firstMatrix, 
        int row2, int col2, int[][] secondMatrix) {
    
        int[][] product = new int[row1][col2]; // Matrix to store product

        // Print First Matrix
        System.out.println("\nFirst Matrix:");
        printMatrix(firstMatrix, row1, col1);

        // Print Second Matrix
        System.out.println("\nSecond Matrix:");
        printMatrix(secondMatrix, row2, col2);

        // Multiply 2 Matrices
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col2; j++){
                for (int k = 0; k < row2; k++){
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Print Product
        System.out.println("\nProduct of the Matrices:");
        printMatrix(product, row1, col2);
    }

    // Method to print Matrix
    public static void printMatrix(int M[][], int rowSize, int colSize){
        for (int i = 0; i < rowSize; i++){
            for (int j = 0; j < colSize; j++){
                System.out.print(M[i][j] + " ");               
            }
            System.out.println();
        }
    }
}
