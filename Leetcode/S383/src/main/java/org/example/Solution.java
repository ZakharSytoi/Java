package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        countCharacters(magazineMap, magazine);
        countCharacters(ransomNoteMap, ransomNote);
        Integer currentInt;

        for (Map.Entry<Character, Integer> entry :
                ransomNoteMap.entrySet()) {
            if (((currentInt = magazineMap.get(entry.getKey())) == null || currentInt < entry.getValue()))
                return false;
        }
        return true;
    }

    private static void countCharacters(HashMap<Character, Integer> map, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else map.put(str.charAt(i), 1);
        }


    }
}
    // Naive solution. count chars in both strings and compare.

    /*public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        countCharacters(magazineMap, magazine);
        countCharacters(ransomNoteMap, ransomNote);

        for (Map.Entry<Character, Integer> entry :
                ransomNoteMap.entrySet()) {
            if (!magazineMap.containsKey(entry.getKey()) || !(magazineMap.get(entry.getKey()) >= entry.getValue()))
                return false;
        }
        return true;
    }
    ---------------------------------------------------------------------------------------------------------------
    // Updated naive approach.

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        countCharacters(magazineMap, magazine);
        countCharacters(ransomNoteMap, ransomNote);
        Integer currentInt;

        for (Map.Entry<Character, Integer> entry :
                ransomNoteMap.entrySet()) {
            if (((currentInt = magazineMap.get(entry.getKey())) == null || currentInt < entry.getValue()))
                return false;
        }
        return true;
    }
    ---------------------------------------------------------------------------------------------------------------
    // another variant. less productive

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        countCharacters(magazineMap, magazine);
        Character currentChar;
        Integer currentInt;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazineMap.containsKey(currentChar = ransomNote.charAt(i))) {
                if(((currentInt = magazineMap.get(currentChar)) == 0)) return false;
                else magazineMap.put(currentChar, currentInt - 1);
            }
            else return false;
        }
        return true;
    }

    ---------------------------------------------------------------------------------------------------------------
    private static void countCharacters(HashMap<Character, Integer> map, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else map.put(str.charAt(i), 1);
        }
    }*/


