public class arra {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        int[] maxNum = new int[7];

        // Initialize the array with non-zero values
        for (int n = 0; n < 7; n++) {
            for (int j = 0; j < 7; j++) {
                array[n][j] = n * 7 + j + 1;
            }
        }

        // Find the maximum value for each column
        for (int n = 0; n < 7; n++) {
            maxNum [n] = array[0][n];
            for (int m = 1; m < 7; m++) {
                if (array[m][n] > maxNum [n]) {
                    maxNum [n] = array[m][n];
                }
            }
        }

        // Assign the maximum value to the corresponding element in the main diagonal
        for (int n = 0; n < 7; n++) {
            array[n][n] = maxNum [n];
        }

        // Print the array
        for (int n = 0; n < 7; n++) {
            for (int m = 0; m < 7; m++) {
                System.out.printf("%-3d", array[n][m]);
            }
            System.out.println(" ");
        }
    }
}

