package org.example;

import java.util.HashMap;

public class Solution {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node currentNode = head;
        Node newHead = new Node(head.val);
        Node newCurrentNode = newHead;
        HashMap<Node, Node> map = new HashMap<>();

        while (currentNode.next != null) {
            newCurrentNode.next = new Node(currentNode.next.val);
            map.put(currentNode, newCurrentNode);
            newCurrentNode = newCurrentNode.next;
            currentNode = currentNode.next;
        }
        map.put(currentNode, newCurrentNode);
        currentNode = head;
        while (currentNode != null) {
            if (currentNode.random == null) map.get(currentNode).random = null;
            else map.get(currentNode).random = map.get(currentNode.random);
            currentNode = currentNode.next;
        }
        return newHead;
    }
}
