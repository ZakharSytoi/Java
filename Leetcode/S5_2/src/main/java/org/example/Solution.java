package org.example;

public class Solution {
    public String longestPalindrome(String s) {
        char[] sArr = s.toCharArray();
        int tmpMiddle;
        int outerI;
        int currentMax = 0;
        int leftMaxIndex = 0, rightMaxIndex = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (sArr[i] == sArr[i + 1]) {
                tmpMiddle = i;
                outerI = 1;
                while (tmpMiddle - outerI >= 0
                        && tmpMiddle + outerI + 1 < s.length()
                        && sArr[tmpMiddle - outerI] == sArr[tmpMiddle + outerI + 1]) {
                    outerI++;
                }
                if (2*outerI > currentMax) {
                    leftMaxIndex = tmpMiddle - outerI+1;
                    rightMaxIndex = tmpMiddle + outerI + 1;
                    currentMax = rightMaxIndex - leftMaxIndex;
                }
            }
            tmpMiddle = i;
            outerI = 1;
            while (tmpMiddle - outerI >= 0
                    && tmpMiddle + outerI < s.length()
                    && sArr[tmpMiddle - outerI] == sArr[tmpMiddle + outerI]) {
                outerI++;
            }
            outerI--;
            if (1+2*outerI > currentMax) {
                leftMaxIndex = tmpMiddle - outerI;
                rightMaxIndex = tmpMiddle + outerI + 1;
                currentMax = rightMaxIndex - leftMaxIndex;
            }
        }
        return s.substring(leftMaxIndex, rightMaxIndex);
    }
}
