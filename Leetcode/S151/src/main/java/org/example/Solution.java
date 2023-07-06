package org.example;


public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(String i: s.split("\\s+")){
            if(i.length() > 0){
                sb.insert(0, i+" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
    }
}
