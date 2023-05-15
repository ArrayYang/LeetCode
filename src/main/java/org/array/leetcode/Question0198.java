package org.array.leetcode;

public class Question0198 {
    public int rob(int[] nums) {
        int[] amount=new int[nums.length];
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
            amount[i]=0;
        for(int i=0;i<n;i++){
            if(i==0||i==1)
                amount[i]=nums[i];
            else{
                max=0;
                for(int j=0;j<=i-2;j++){
                    if(amount[j]>max)
                        max=amount[j];
                }
                amount[i]=nums[i]+max;
            }

        }
        int max_amount=0;
        for(int i=0;i<n;i++)
            if(max_amount<amount[i])
                max_amount=amount[i];
        return max_amount;
    }
}
