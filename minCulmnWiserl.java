

public class minCulmnWiserl {
    public static void main(String[] args) {
        int[][] array4 = new int [7][7];
        int[] minNm = new int[7];


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                array4[i][j] = (int) (Math.random() * 10) + 10;
            }
        }

        
        for (int i = 0; i < 7; i++) {
            int min = array4[0][i];
            for (int j = 1; j < 7; j++) {
                if (array4[j][i] < min) {
                    min = array4[j][i];
                }
            }
            minNm[i] = min;
        }

       

        for (int i = 0; i < 3; i++) {
            int x = minNm[i];
            minNm[i] = minNm[6 - i];
            minNm[6 - i] = x;
        }

        for (int i = 0; i < 7; i++) {
            array4[i][6- i] = minNm[i];
        }

        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-4d",array4[i][j]);
            }
            System.out.println();
        }
    }
}
