// INES RUHENGERI
// Name: UWAYO Noella
// Reg: 22/16752
//    Assignment1:     OOP with java




public class minColumnWiselr {
   
    public static void main(String[] args) {
        int[][] array1 = new int[7][7];
        
        int[] minNm = new int[7];

        for (int r = 0; r < 7; r++) {
            for (int c = 0; c <7; c++) {
                array1[r][c] = (int) (Math.random()  * 10) + 10;
            }
        }


        for (int r = 0; r < 7; r++) {
            minNm[r] = Integer.MAX_VALUE;
            for (int c = 0; c < 7; c++) {
                if (array1[c][r] < minNm [r] && array1[c][r] != 0) {
                    minNm [r] = array1[c][r];
                }}
            array1[r][r] = minNm [r];
        }
        




        for (int r = 0; r < 7; r++) {
            for (int c = 0; c < 7; c++) {
                System.out.printf("%-4d",array1[r][c]);
            }
            System.out.println();
        }
    }

}
