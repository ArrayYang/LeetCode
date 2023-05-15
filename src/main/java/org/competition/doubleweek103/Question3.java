package org.competition.doubleweek103;

public class Question3 {
    public int findMaxFish(int[][] grid) {
        int total = 0;
        int sum=0;
        int[][] available=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if(grid[i][j]==0)
                    available[i][j]=0;
                else
                    available[i][j]=1;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if(grid[i][j]!=0)
                    sum=dfs(grid,i,j);
        return total;
    }

    private int dfs(int[][] grid, int i, int j) {
        return 0;
    }
}
