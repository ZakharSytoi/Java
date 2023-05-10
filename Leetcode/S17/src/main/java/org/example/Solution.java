package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> resultList = new ArrayList<String>();
        if(digits.isEmpty())return resultList;
        resultList.add("");
        ArrayList<String> tmpList = new ArrayList<String>();
        for (int i = 0; i < digits.length(); i++) {
            char[] chars;
            switch (digits.charAt(i)) {
                case '2': {
                    chars = new char[]{'a', 'b', 'c'};
                    break;
                }
                case '3': {
                    chars = new char[]{'d', 'e', 'f'};
                    break;
                }
                case '4': {
                    chars = new char[]{'g', 'h', 'i'};
                    break;
                }
                case '5': {
                    chars = new char[]{'j', 'k', 'l'};
                    break;
                }
                case '6': {
                    chars = new char[]{'m', 'n', 'o'};
                    break;
                }
                case '7': {
                    chars = new char[]{'p', 'q', 'r', 's'};
                    break;
                }
                case '8': {
                    chars = new char[]{'t', 'u', 'v'};
                    break;
                }
                case '9': {
                    chars = new char[]{'w', 'x', 'y', 'z'};
                    break;
                }
                default: {
                    return null;
                }
            }
            for (String outerStr : resultList) {
                for (char ch : chars) {
                    tmpList.add(outerStr + String.valueOf(ch));
                }
            }
            resultList.clear();
            resultList.addAll(tmpList);
            tmpList.clear();

        }
        return resultList;
    }
}