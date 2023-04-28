public class maxColumnWise {
   
    public static void main(String[] args) {
        int[][] array1 = new int[7][7];
        
        int[] maxNm = new int[7];

        for (int r = 0; r < 7; r++) {
            for (int c = 0; c <7; c++) {
                array1[r][c] = (int) (Math.random()  * 10) + 10;
            }
        }


        for (int r = 0; r < 7; r++) {
            for (int c = 0; c < 7; c++) {
                if (array1[c][r] > maxNm [r]) {
                    maxNm [r] = array1[c][r];
                }}
            array1[r][r] = maxNm [r];
        }

        
        for (int r = 0; r < 7; r++) {
            for (int c = 0; c < 7; c++) {
                System.out.printf("%-4d",array1[r][c]);
            }
            System.out.println();
        }
    }

}
