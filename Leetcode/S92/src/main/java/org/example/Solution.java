package org.example;


import java.util.ArrayList;
import java.util.List;

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

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode leftNode;
        ListNode leftLeftNode = head;
        List<ListNode> listTmp = new ArrayList<>();
        boolean leftFlag = false;
        if (left == 1) leftFlag = true;
        int i = 1;
        while (head.next != null) {
            if (i == left - 1 || leftFlag) {
                if (!leftFlag) {
                    leftNode = head;
                    head = head.next;
                    while (i != right){
                        listTmp.add(head);
                        head = head.next;
                        i++;
                    }
                    leftNode.next = listTmp.get(listTmp.size() - 1);
                    for (int j = listTmp.size() - 1; j > 0; j--) {
                        listTmp.get(j).next = listTmp.get(j-1);
                    }
                    listTmp.get(0).next = head;
                    return leftLeftNode;
                }
                while (i != right){
                    listTmp.add(head);
                    head = head.next;
                    i++;
                }
                for (int j = listTmp.size() - 1; j > 0; j--) {
                    listTmp.get(j).next = listTmp.get(j-1);
                }
                leftLeftNode = head;
                listTmp.get(0).next = head.next;
                leftLeftNode.next = listTmp.get(listTmp.size()-1);
                return leftLeftNode;
            }
            i++;
            head = head.next;
        }
        return leftLeftNode;
    }
}