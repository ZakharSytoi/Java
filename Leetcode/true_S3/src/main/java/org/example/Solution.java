package org.example;

import java.lang.StringBuilder;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int maxSubStrLength = 0;
        int currentSubStrLength = 0;
        StringBuilder tmpStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (tmpStr.indexOf(String.valueOf(s.charAt(i))) == -1) {
                currentSubStrLength++;
            } else {
                tmpStr.setLength(0);
                currentSubStrLength = 0;
                for (int j = i-1; j >= 0; j--) {
                    if(s.charAt(j) == s.charAt(i)){
                        i = j;
                        break;
                    }

                }
            }
            if (maxSubStrLength < currentSubStrLength) maxSubStrLength = currentSubStrLength;
        }
        return maxSubStrLength;
    }
}
