package com.gz.leetcode.editor.en;

/**
 * 反转一个单链表。
 *
 *  示例:
 *
 *  输入: 1->2->3->4->5->NULL
 *  输出: 5->4->3->2->1->NULLv
 */
public class reverseList2 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        System.out.println(reverseList(listNode).val);
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode node = reverseList(head.next);
        head.next.next = node;
        head.next = null;
        return node;
    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }


      }
}
