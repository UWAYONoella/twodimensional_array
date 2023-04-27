public class maxRowWise {
    public static void main(String[] args) {
        int[][] array2 = new int[7][7];
        int[] max = new int[7];

        for (int i = 0; i < 7; i++) {
            
            max[i] = 0;

            for (int j = 0; j < 7; j++) {
                array2[i][j] = (int) (Math.random() * 100) + 1;

                
                if (array2[i][j] > max[i]) {
                    max[i] = array2[i][j];
                }
            }

            
            array2[i][i] = max[i];
        }

       
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-4d", array2[i][j]);
            }
            System.out.println();
        }
    }
}
