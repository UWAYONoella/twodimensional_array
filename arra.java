public class arra {
    public static void main(String[] args) {
        int[][] array = new int[7][7];

        // Initialize the array with non-zero values
        for (int n = 0; n < 7; n++) {
            for (int j = 0; j <7; j++) {
                array[n][j] = n * 7 + j + 1;
            }
        }

        // Find the maximum value for each column
        for (int n = 0; n < 7; n++) {
            int maxNum = Integer.MIN_VALUE;
            for (int m = 0; m < 7; m++) {
                if (array[m][n] > maxNum) {
                    maxNum = array[m][n];
                }
            }
            // Assign the maximum value to the corresponding element in the main diagonal
            array[n][n] = maxNum;
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

