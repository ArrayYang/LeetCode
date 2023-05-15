package org.array.leetcode;

public class Question1290 {
    public int getDecimalValue(ListNode head) {
        int ans=0;
        ListNode curNode=head;
        while(curNode!=null){
            ans=ans*2+curNode.val;
            curNode=curNode.next;
        }
        return ans;
    }
}
