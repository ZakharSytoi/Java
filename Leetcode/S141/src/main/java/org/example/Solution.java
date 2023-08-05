package org.example;
public class Solution {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

      // Smart solution: Fast and Slow. dont know how, but it works fast.
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            head = head.next;
            fast = fast.next.next;
            if(fast == head) return true;
        }
        return false;
    }


    // Naive and not optimal solution. add all and check if present.
    /*public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while(head.next!=null){
            if(set.contains(head)) return true;
            else set.add(head);
            head = head.next;
        }
        return false;
    }*/
}
