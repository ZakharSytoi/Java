package org.example;

import java.util.ArrayList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode tmp = head;
        ArrayList<ListNode> heap = new ArrayList<ListNode>();
        do {
            heap.add(tmp);
            tmp = tmp.next;
        } while (tmp.next != null);
        heap.add(tmp);
        if (heap.size() - n == 0) {
           return head.next;
        } else {
            heap.get(heap.size() - 1 - n).next =
                    heap.get(heap.size() - n).next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
