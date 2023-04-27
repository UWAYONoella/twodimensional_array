public class maxRowWise {
    public static void main(String[] args) {

        int[][] arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            int max = 0;
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (int) (Math.random() * 100) + 1;
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            arr[i][i] = max;
        }

        // Print the array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
}
}