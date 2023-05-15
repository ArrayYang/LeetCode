package org.competition.week345;

import java.util.Arrays;

public class Question3 {
    int[][] grid, dp;
    int n, m;

    public int maxMoves(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i][0] != -1) {
                continue;
            }
            int curr = dfs(i, 0, Integer.MIN_VALUE, 0);
            max = Math.max(max, curr);
        }
        return max - 1;
    }

    private int dfs(int i, int j, int pre, int depth) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] <= pre) {
            return depth;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int d1 = dfs(i - 1, j + 1, grid[i][j], depth);
        int d2 = dfs(i, j + 1, grid[i][j], depth);
        int d3 = dfs(i + 1, j + 1, grid[i][j], depth);

        depth = Math.max(Math.max(d1, d2), d3) + 1;
        dp[i][j] = depth;
        return depth;
    }
}