package org.example;


class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        boolean setPreviousFlag = true;
        while (current != null && current.next != null) {
            while (current.next != null && current.next.val == current.val) {
                current = current.next;
                setPreviousFlag = false;
            }
            if (current.val == head.val && current != head) {
                head = current.next;
                previous = head;
                current = current.next;
                continue;
            }
            if (setPreviousFlag) {
                if (previous != null) previous.next = current;
                previous = current;
            }
            current = current.next;
            setPreviousFlag = true;
        }
        if (previous != null && previous != head) previous.next = current;
        return head;
    }
}
