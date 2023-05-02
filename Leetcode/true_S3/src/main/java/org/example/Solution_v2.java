package org.example;

import java.util.HashMap;

public class Solution_v2 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength= 0;
        int currentLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                currentLength = 0;
                i = map.get(s.charAt(i));
                map.clear();
            }
            else {
                map.put(s.charAt(i), i);
                currentLength++;
            }
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
