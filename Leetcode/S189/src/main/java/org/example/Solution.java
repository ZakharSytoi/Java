package org.example;

import java.util.Arrays;
// the idea is to create the circle list, while building set head on the place from which the resulting array should start
// and then just copy values from list into the initial array by simple iteration in this list until we reach the head again.
public class Solution {
    public void rotate(int[] nums, int k) {
        circleList list = new circleList(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    private class circleList {
        Node head;

        circleList(int[] nums, int index) {
            Node node = new Node(nums[0]);
            if (index > nums.length) index = index % nums.length;
            head = node;
            Node first = node;
            for (int i = 1; i < nums.length; i++) {
                node.next = new Node(nums[i]);
                if (i == nums.length - index && index != 0) {
                    head = node.next;
                }
                node = node.next;
            }
            node.next = first;
            node = head;
            int i = 0;
            while (node.next != head && i < nums.length) {
                nums[i] = node.value;
                i++;
                node = node.next;
            }
            nums[nums.length - 1] = node.value;
        }

    }
}

