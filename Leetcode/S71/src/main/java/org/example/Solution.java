package org.example;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String str : path.split("/")) {
            switch (str) {
                case "", ".", "/" -> {
                }
                case ".." -> {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                default -> stack.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        for (String str : stack) {
            sb.append(str).append("/");
        }
        if (sb.length() != 1)
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
