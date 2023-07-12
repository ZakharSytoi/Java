package org.example;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<CharArray, List<String>> charMap = new HashMap<>();
        for(String s: strs){
            CharArray arr = new CharArray();
            arr.count(s);
            if(charMap.containsKey(arr)){
                charMap.get(arr).add(s);
            }
            else {
                charMap.put(arr, new ArrayList<>());
                charMap.get(arr).add(s);
            }
        }
        return new ArrayList<>(charMap.values());
    }

    static class CharArray{
        private final char[] arr = new char[26];

        public void count(String s){
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(arr);
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof CharArray instance){
                char[] objArr = instance.getArr();
                for(int i = 0; i< 26; i++){
                    if(this.arr[i] != objArr[i]) return false;
                }
            }
            return true;
        }

        public char[] getArr() {
            return arr;
        }
    }



    // naive solution
    /*public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> set = new HashSet<>();
        int listIndex = 0;
        List<String> currentList;
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (!set.contains(strs[i])) {
                set.add(strs[i]);
                result.add(currentList = new ArrayList<>());
                currentList.add(strs[i]);
                for (int j = i; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j])){
                        currentList.add(strs[j]);
                        set.add(strs[j]);
                    }
                }
            }
            if(set.size() == strs.length)return result;
        }
        return result;
    }

       public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr = new char[26];
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
    */


}
