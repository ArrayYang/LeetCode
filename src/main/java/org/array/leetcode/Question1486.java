package org.array.leetcode;

public class Question1486 {
    public int xorOperation(int n, int start) {
        int ans=start;
        for(int i=1;i<n;i++){
            ans=ans^(2*i+start);
        }
        return ans;
    }
}
