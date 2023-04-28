public class minRowWise {
    public static void main(String[] args) {
        int[][] array3 = new int[7][7];
        int[] minNm = new int[7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                array3[i][j] = (int) (Math.random() * 10) + 10;
            }
        }

    
        
        
        for (int i = 0; i < 7; i++) {
            int min = array3[i][0];
            for (int j = 1; j < 7; j++) {
                if (array3[i][j] < min) {
                    min = array3[i][j];
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
            array3[6 - i][i] = minNm[i];
        }

        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-4d",array3[i][j]);
            }
            System.out.println();
        }
    }
}
