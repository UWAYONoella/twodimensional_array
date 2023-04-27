public class std {
    public static void main(String[] args){
     // int[][] arr = new int;
        // int[] max = new int;

        // // Initialize the array with non-zero values
        // for (int i = 0; i < 7; i++) {
        //     for (int j = 0; j < 7; j++) {
        //         arr[i][j] = i * 7 + j + 1;
        //     }
        // }

        // // Find the maximum value for each row
        // for (int i = 0; i < 7; i++) {
        //     max[i] = arr[i];
        //     for (int j = 1; j < 7; j++) {
        //         if (arr[i][j] > max[i]) {
        //             max[i] = arr[i][j];
        //         }
        //     }
        // }

        // // Assign the maximum value to the corresponding element in the main diagonal
        // for (int i = 0; i < 7; i++) {
        //     arr[i][i] = max[i];
        // }

        // // Print the array
        // for (int i = 0; i < 7; i++) {
        //     for (int j = 0; j < 7; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}









// public class std {
//     public static void main(String[] args) {
//         int[][] arr = new int[7][7];
//         for (int col = 0; col < 7; col++) {
//             int maxRow = 0;
//             for (int row = 0; row < 7; row++) {
//                 if (arr[row][col] > arr[maxRow][col]) {
//                     maxRow = row;
//                 }
//             }
//             arr[maxRow][col] = 49 + col; // Set maximum value for column
//             for (int row = 0; row < 7; row++) {
//                 if (row != maxRow && arr[row][col] == 0) {
//                     arr[row][col] = (col + row) * 7 + (col + 1) % 7;
//                 }
//             }
//         }
//         // Copy the maximum values to the main diagonal
//         for (int i = 0; i < 7; i++) {
//             arr[i][i] = arr[i][6 - i] + 21 * i;
//         }
//         // Print the array
//         for (int row = 0; row < 7; row++) {
//             for (int col = 0; col < 7; col++) {
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
// }





















// public class std {
//     public static void main(String[] args) {
//         int[][] matrix = new int[7][7];
//         for (int i = 0; i < matrix.length; i++) {
//                 int maxIndex = 0;
//                 for (int j = 1; j < matrix[i].length; j++) {
//                     if (matrix[j][i] > matrix[maxIndex][i]) {
//                         maxIndex = j;
//                     }
//                 }
//                 matrix[maxIndex][i] = (i + 1) * 10 + maxIndex + 1;
//                 for (int j = 0; j < matrix[i].length; j++) {
//                     if (j != maxIndex) {
//                         matrix[j][i] = (i + 1) * 49 + j + 1;
//                     }
//                     System.out.print(matrix [i][i] + " ");
//                 }
//                 System.out.println();
//             }
//     }
// }
