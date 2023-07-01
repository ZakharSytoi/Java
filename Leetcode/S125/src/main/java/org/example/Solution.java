package org.example;

public class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        s = s.toLowerCase();
        while (right >= left) {
            if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else {
                if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) return false;
                else {
                    right--;
                    left++;
                }
            }
        }
        return true;
    }
}
/*public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[\\W_]", "");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }*/