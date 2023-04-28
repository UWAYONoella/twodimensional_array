public class maxRowWiselr {
    public static void main(String[] args) {
        int[][] array2 = new int[7][7];
        int[] maxNm = new int[7];

        for (int a = 0; a < 7; a++) {

            for (int b = 0; b < 7; b++) {
                array2[a][b] = (int) (Math.random() * 10) + 10;

                 if (array2[a][b] > maxNm[a]) {
                    maxNm[a] = array2[a][b];
                }
            }

            
            array2[a][a] = maxNm[a];
        }

       
        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 7; b++) {
                System.out.printf("%-4d", array2[a][b]);
            }
            System.out.println();
        }
    }
}
