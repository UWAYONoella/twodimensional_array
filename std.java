public class std {
    public static void main(String[] args){
     int[][] arr = new int[7][7];
        int[] max = new int[7];

        // Initialize the array with non-zero values
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = i * 7 + j + 1;
            }
        }

        // Find the maximum value for each row
        for (int i = 0; i < 7; i++) {
            max[i] = arr[i][j];
            for (int j = 1; j < 7; j++) {
                if (arr[i][j] > max[i]) {
                    max[i] = arr[i][j];
                }
            }
        }

        // Assign the maximum value to the corresponding element in the main diagonal
        for (int i = 0; i < 7; i++) {
            arr[i][i] = max[i];
        }

        // Print the array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

