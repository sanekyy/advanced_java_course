package edu.technopolis.homework.matrixMultiplication;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by ihb on 14.01.17.
 */
public class Matrix {
    private int[][] data;

    private int m,n;

    Matrix(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        this.data = matrix;
    }

    @Nullable
    Matrix multiply(@NotNull Matrix matrix){
        if(m!=matrix.n){
            System.out.println("Sizes of matrices are not compatible");
            return null;
        }

        int[][] outMatrix = new int[n][matrix.m];

        for(int i=0; i<n; i++){
            for(int j=0; j<matrix.m; j++){
                for(int r = 0; r<m; r++){
                    outMatrix[i][j] += data[i][r]*matrix.data[r][j];
                }
            }
        }

        return new Matrix(outMatrix);
    }


    @Override
    public String toString() {
        String res = "";
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                res += data[i][j] + " ";
            }
            res+="\n";
        }
        return res;
    }
}