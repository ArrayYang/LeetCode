package org.array.leetcode;

public class Question1572 {
    public int diagonalSum(int[][] mat) {
        int length=mat.length;
        int total=0;
        if(length%2!=0){
            for(int i=0;i<length;i++){
                total=total+mat[i][i]+mat[i][length-i-1];
            }
            return(total-mat[length/2][length/2]);
        }else{
            for(int i=0;i<length;i++){
                total=total+mat[i][i]+mat[i][length-i-1];
            }
            return total;
        }
    }
}
