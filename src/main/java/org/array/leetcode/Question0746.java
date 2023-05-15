package org.array.leetcode;

public class Question0746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] amount=new int[cost.length+1];
        amount[0]=cost[0];
        amount[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            amount[i]=Math.min(amount[i-1],amount[i-2])+cost[i];
        }
        amount[cost.length]=Math.min(amount[cost.length-1],amount[cost.length-2]);
        return amount[cost.length];
    }
}
