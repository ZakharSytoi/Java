package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ListNode head = new ListNode(-3);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(-2);
        /*head.next.next.next = new ListNode(-2);
        head.next.next.next.next = new ListNode(-2);
        head.next.next.next.next.next = new ListNode(-1);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next = new ListNode(4);*/
        Solution s = new Solution();
        s.deleteDuplicates(head);
    }
}
