import java.util.Arrays;

public class minCulmn {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49}
        };

        // Find the minimum value for each column
        int[] minValues = new int[7];
        for (int i = 0; i < 7; i++) {
            int min = arr[0][i];
            for (int j = 1; j < 7; j++) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                }
            }
            minValues[i] = min;
        }

        // Sort the minimum values in descending order
        Arrays.sort(minValues);
        for (int i = 0; i < 3; i++) {
            int temp = minValues[i];
            minValues[i] = minValues[6 - i];
            minValues[6 - i] = temp;
        }

        // Assign the sorted minimum values to the diagonal elements of the array
        for (int i = 0; i < 7; i++) {
            arr[i][6 - i] = minValues[i];
        }

        // Print the resulting array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}