package org.array.leetcode;

import java.util.*;

public class Question0077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        if(n<k||k<=0)
            return res;
        Deque<Integer> path=new ArrayDeque<>();
        dfs(n,k,1,path,res);
        return res;
    }

    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=begin;i<=n;i++){
            path.addLast(i);
            dfs(n,k,i+1,path,res);
            path.removeLast();
        }
    }

}
