package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        ArrayList<Integer> rightIndexArray = new ArrayList<>(s.length() / 2);
        ArrayList<Integer> leftIndexArray = new ArrayList<>(s.length() / 2);
        ArrayList<Integer> middleIndexArrayArray = new ArrayList<>(2);

        ArrayList<Integer> returnIndexArray = new ArrayList<>();
        int sidesCounter = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                middleIndexArrayArray.add(i);
                middleIndexArrayArray.add(i + 1);
                while (i - sidesCounter >= 0 &&
                        i + sidesCounter + 1 < s.length() &&
                        s.charAt(i - sidesCounter) == s.charAt(i + sidesCounter + 1)) {
                    leftIndexArray.add(i - sidesCounter);
                    rightIndexArray.add(i + sidesCounter + 1);
                    sidesCounter++;
                }
            }
            if (rightIndexArray.size() + middleIndexArrayArray.size() + leftIndexArray.size() > returnIndexArray.size()) {
                returnIndexArray.clear();
                Collections.reverse(leftIndexArray);
                returnIndexArray.addAll(leftIndexArray);
                returnIndexArray.addAll(middleIndexArrayArray);
                returnIndexArray.addAll(rightIndexArray);
            }
            rightIndexArray.clear();
            leftIndexArray.clear();
            middleIndexArrayArray.clear();
            sidesCounter = 1;
        }

        for (int i = 0; i < s.length(); i++) {
            middleIndexArrayArray.add(i);
            while (i - sidesCounter >= 0 &&
                    i + sidesCounter < s.length() &&
                    s.charAt(i - sidesCounter) == s.charAt(i + sidesCounter)) {
                leftIndexArray.add(i - sidesCounter);
                rightIndexArray.add(i + sidesCounter);
                sidesCounter++;
            }

            if (rightIndexArray.size() + middleIndexArrayArray.size() + leftIndexArray.size() > returnIndexArray.size()) {
                returnIndexArray.clear();
                Collections.reverse(leftIndexArray);
                returnIndexArray.addAll(leftIndexArray);
                returnIndexArray.addAll(middleIndexArrayArray);
                returnIndexArray.addAll(rightIndexArray);
            }
            rightIndexArray.clear();
            leftIndexArray.clear();
            middleIndexArrayArray.clear();
            sidesCounter = 1;
        }


        return returnIndexArray
                .stream()
                .map(s::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    private static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
