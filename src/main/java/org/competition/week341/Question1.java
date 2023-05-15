package org.competition.week341;

public class Question1 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[2];
        int min = -1;
        int now = 0;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            now = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1)
                    now++;
            }
            if (now > min) {
                pos = i;
                min = now;
            }
        }
        arr[0] = pos;
        arr[1] = min;
        return arr;
    }
}
