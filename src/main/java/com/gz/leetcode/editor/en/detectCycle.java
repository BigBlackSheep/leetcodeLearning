package com.gz.leetcode.editor.en;

/**
 * 判断链表是否有环
 */
public class detectCycle {

    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while (slow != null && fast.next != null){
                slow = head.next;
                fast = head.next.next;
                if(slow == fast){
                    return fast;
                }
        }
        return null;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }


    }
}
