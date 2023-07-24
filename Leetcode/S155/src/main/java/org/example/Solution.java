package org.example;

import java.util.Stack;

public class Solution {
    class MinStack {
        Stack<Pair> stack;

        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int val) {
            stack.push(stack.isEmpty() ?
                    new Pair(val, val) :
                    new Pair(val, Math.min(stack.peek().minValue, val)));
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().value;
        }

        public int getMin() {
            return stack.peek().minValue;
        }

        class Pair {
            int value;
            int minValue;

            public Pair(int value, int minValue) {
                this.value = value;
                this.minValue = minValue;
            }
        }
    }
}
