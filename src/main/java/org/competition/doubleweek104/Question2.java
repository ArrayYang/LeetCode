package org.competition.doubleweek104;

import java.util.Arrays;

public class Question2 {
    public int matrixSum(int[][] nums) {
        int score = 0;
        for (int i = 0; i < nums.length; i++)
            Arrays.sort(nums[i]);
        for (int j = 0; j < nums[0].length; j++) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i][j])
                    max = nums[i][j];
            }
            score += max;
        }
        return score;
    }
}
