package org.array.leetcode;

public class Question0064 {
    public int minPathSum(int[][] grid) {
        int[][] cost = new int[grid.length][grid[0].length];
        cost[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0)
                    cost[0][0]=grid[0][0];
                else if (i == 0 && j != 0) {
                    cost[i][j] = cost[i][j - 1] + grid[i][j];
                } else if (i != 0 && j == 0) {
                    cost[i][j] = cost[i - 1][j] + grid[i][j];
                } else {
                    cost[i][j] = grid[i][j] + (cost[i - 1][j] > cost[i][j - 1] ? cost[i][j - 1] : cost[i - 1][j]);
                }
            }
        }
        return cost[grid.length - 1][grid[0].length - 1];
    }
}
