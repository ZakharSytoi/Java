package org.example;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')' -> {
                    if (!stack.isEmpty() && '(' == stack.peek()) stack.pop();
                    else stack.push(s.charAt(i));
                }
                case ']' -> {
                    if (!stack.isEmpty() && '[' == stack.peek()) stack.pop();
                    else stack.push(s.charAt(i));
                }
                case '}' -> {
                    if (!stack.isEmpty() && '{' == stack.peek()) stack.pop();
                    else stack.push(s.charAt(i));
                }
                default -> stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
