package com.gz.leetcode.editor.en;

/**
 * 反转一个单链表。
 *
 *  示例:
 *
 *  输入: 1->2->3->4->5->NULL
 *  输出: 5->4->3->2->1->NULLv
 */
public class reverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        System.out.println(reverseList(listNode).val);
    }

    public static ListNode reverseList(ListNode head) {
        //申请两个指针
        //一个指向head 用于后续遍历
        //另一个用于存储返回
        ListNode currentNode = head;
        ListNode returnNode = null;
        while (currentNode != null){
            ListNode node = currentNode.next; //先获取下一个节点的值
            currentNode.next = returnNode;//下一个节点的 先值等于null
            returnNode = currentNode;   //用于返回的Node 等于当前节点
            currentNode = node; //当前节点等于下一个节点
        }
        return returnNode;

    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }


      }
}
