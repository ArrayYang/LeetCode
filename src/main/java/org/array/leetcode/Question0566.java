package org.array.leetcode;

public class Question0566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=0,m=0;
        if(mat.length*mat[0].length!=r*c)
            return mat;
        else{
            int[][] matrix=new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    if(m<c){
                        matrix[n][m]=mat[i][j];
                        m++;
                    }else{
                        n++;m=0;
                        matrix[n][m]=mat[i][j];
                        m++;
                    }
                }
            }

            return matrix;
        }
    }
}