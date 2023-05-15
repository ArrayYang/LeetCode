package org.array.leetcode;

public class Question0135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
            else
                left[i] = 1;
        }
        int ret = 0;
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        for (int i = 0; i < n; i++)
            ret += left[i] > right[i] ? left[i] : right[i];
        return ret;
    }
}
