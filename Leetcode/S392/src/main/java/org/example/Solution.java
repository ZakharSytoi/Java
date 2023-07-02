package org.example;

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int subSequenceIndex = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(subSequenceIndex)) subSequenceIndex++;
            if(subSequenceIndex == s.length())return true;
        }
        return false;
    }
}
