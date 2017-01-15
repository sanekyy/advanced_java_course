package edu.technopolis.homework.matrixMultiply;

import edu.technopolis.homework.MyIO;

/**
 * Matrix multiplication home task.
 * <br/>
 * Matrix dimension and elements are passed as CLI arguments.
 */
public class MatrixMultiplication {
    public static void main(String... args) {
        MyIO.FastScanner in = MyIO.getInByFile();
        Matrix matrix1, matrix2;

        int n1, m1, n2, m2;

        n1 = in.nextInt();
        m1 = in.nextInt();
        n2 = in.nextInt();
        m2 = in.nextInt();

        int[][] data = new int[n1][m1];

        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                data[i][j] = in.nextInt();
            }
        }

        matrix1 = new Matrix(data);

        data = new int[n2][m2];

        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++){
                data[i][j] = in.nextInt();
            }
        }

        matrix2 = new Matrix(data);


        System.out.println(matrix1.multiply(matrix2));
    }
}
