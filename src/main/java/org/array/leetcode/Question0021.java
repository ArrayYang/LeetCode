package org.array.leetcode;

public class Question0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead=new ListNode(-1);
        ListNode prev=prehead;
        while ((list1!=null)&&(list2!=null)){
            if(list1.val<=list2.val){
                prev.next=list1;
                list1=list1.next;
            }else {
                prev.next=list2;
                list2=list2.next;
            }
            prev=prev.next;
        }
        return prehead.next;
    }
}
