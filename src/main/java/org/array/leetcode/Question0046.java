package org.array.leetcode;

import java.util.*;

public class Question0046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int length=nums.length;
        if(length==0)
            return res;
        boolean[] used=new boolean[length];
        Deque<Integer> path=new ArrayDeque<>();
        dfs(nums,length,0,path,used,res);
        return res;

    }

    private void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if(depth==length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<length;i++){
            if(!used[i]){
                path.addLast(nums[i]);
                used[i]=true;
                dfs(nums,length,depth+1,path,used,res);
                used[i]=false;
                path.removeLast();
            }
        }
    }

}
