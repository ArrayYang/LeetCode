package org.array.leetcode;
import java.util.*;
public class Question0589 {
    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        for (Node ch : root.children) {
            helper(ch, res);
        }
    }
}
