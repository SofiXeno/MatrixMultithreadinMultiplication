
public class Main {

    static final int K = 5;
    static final int NUMS = 50;


    public static void main(String args[]) {
        CasualMatrixMultuply m = new CasualMatrixMultuply(K,NUMS);

        int[][] m1 = m.getM1();
        int[][] m2 = m.getM2();



        final Stopwatch sw = new Stopwatch();
        int product[][] = m.multiplyMatrices(m1, m2);
        final double elapsedMillisCasual = sw.elapsedTime();



        if (product != null) {
            printMatrix(m1);
            System.out.println(" X ");
            printMatrix(m2);
            System.out.println(" = ");
            printMatrix(product);
        }


       // Time for casual matrix multiplying
        System.out.println("K = " + K);
        System.out.println("Time for casual multiplying: " + elapsedMillisCasual + " seconds.");




        //Multithread matrix multiplying
        int[][] resultTheading = new int[m1.length][m2[0].length];

        final Stopwatch sw2 = new Stopwatch();
        ParallelThreadsCreator.multiply(m1, m2, resultTheading);
        final double elapsedMillisThreading = sw2.elapsedTime();

        //Time for multithread matrix multiplying
        System.out.println("Time for threading multiplying: " + elapsedMillisThreading + " seconds.");




    }



    /**
     * Method to print a 2-D matrix row-wise
     *
     * @param matrix
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }


}