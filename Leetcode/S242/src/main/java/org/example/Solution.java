package org.example;


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr = new char[25];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 25; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}
        // Easy way to count english letters is to create char[26]
        // then in for loop iterate through string and increment position
        // charAt(i) - a. That way we get index of this letter if from 0
        // a = 97, a - a = 0; b = 98 ==> b-a = 1
        // 0 and 1 be the indexes in char[26] array, so we can count how many
        // entrances of each letter do we have.


        // simple working solution. not effective.
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            } else mapS.put(s.charAt(i), 1);
            if (mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            } else mapT.put(t.charAt(i), 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!mapS.getOrDefault(t.charAt(i), 0).equals(mapT.getOrDefault(t.charAt(i), 1))) return false;
        }
        return true;
    }*/