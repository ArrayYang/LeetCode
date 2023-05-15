package org.competition.week344;

public class Question4 {
    int ans = 0;
    public int minIncrements(int n, int[] cost) {
        dfs(1, cost);
        return ans;
    }

    public int dfs(int index, int[] cost) {
        if (index * 2 > cost.length) {
            return cost[index - 1];
        }
        int left = dfs(index * 2, cost);
        int right = dfs(index * 2 + 1, cost);
        ans += Math.abs(left - right);
        return Math.max(left, right) + cost[index - 1];
    }
}
