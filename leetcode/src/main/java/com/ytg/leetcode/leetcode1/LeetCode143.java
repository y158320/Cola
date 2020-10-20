package com.ytg.leetcode.leetcode1;

public class LeetCode143 {

    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return;
        ListNode temp=head;
        while(temp.next.next!=null)  temp=temp.next;
        temp.next.next=head.next;
        head.next=temp.next;
        temp.next=null;
        reorderList(head.next.next);

    }


}
