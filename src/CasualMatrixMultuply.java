public class CasualMatrixMultuply {



    private int m1[][];
    private int m2[][];
    //private int result[][];




    public CasualMatrixMultuply(int K, int NUMS) {

        this.m1=RandomMatrix(K,NUMS);
        this.m2=RandomMatrix(K,NUMS);

       // this.result = multiplyMatrices(m1,m2);



    }

    public int[][] getM1() {
        return m1;
    }

    public int[][] getM2() {
        return m2;
    }
//
//    public int[][] getResult() {
//        return result;
//    }



    private static int[][] RandomMatrix(int n, int NUMS) {
        int[][] randomMatrix = new int [n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                randomMatrix[i][j]= (int) (Math.random()*(NUMS+1));
            }

        }

        return randomMatrix;
    }


    /**
     * Method to multiply matrices
     * @param matrix1
     * @param matrix2
     */
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m1_rows=matrix1.length;
        int m1_columns=matrix1[0].length;
        int m2_rows=matrix2.length;
        int m2_columns=matrix2[0].length;
        int[][] product = new int[m1_rows][m2_columns];
        if ((m1_columns != m2_rows)) {
            System.out.println("Error - Number of columns of matrix1 IS NOT EQUAL TO number of rows of matrix2.");
        } else {

            for (int i = 0; i < m1_rows; i++) {
                for (int j = 0; j < m2_columns; j++) {
                    for(int k=0;k < m1_columns;k++){
                        product[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        return product;
    }

}
