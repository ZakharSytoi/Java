package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        int startingIndex = 0;
        int middleIndex = 0;
        int maxLength = 0;
        Set<Character> setOfUnique = new HashSet<>();
        while (middleIndex < s.length()) {
            if(!setOfUnique.contains(s.charAt(middleIndex))){
                setOfUnique.add(s.charAt(middleIndex));
                middleIndex++;
                maxLength = Math.max(maxLength, setOfUnique.size());
            }else {
                setOfUnique.remove(s.charAt(startingIndex));
                startingIndex++;
            }
        }
        return maxLength;
    }
    // the idea is to add chars until finding first repeating one.
    // then remove it from set using stored in 'startingIndex' position
    // then move it by one to the right. so we have same set but without repeating char
    // then repeat the process of adding new chars till finding repeating one
    /*public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        int startingIndex = 0;
        int middleIndex = 0;
        int maxLength = 0;
        Set<Character> setOfUnique = new HashSet<>();
        while (startingIndex < s.length() - 1) {
            while (middleIndex < s.length() &&!setOfUnique.contains(s.charAt(middleIndex))) {
                setOfUnique.add(s.charAt(middleIndex));
                middleIndex++;
            }
            startingIndex++;
            middleIndex = startingIndex;
            maxLength = Math.max(maxLength, setOfUnique.size());
            setOfUnique.clear();
        }
        return maxLength;
    }*/
}
