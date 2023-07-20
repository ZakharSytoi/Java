package org.example;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minLength = 0;
        char current;
        int i = 0;
        while(true){
            try{
                current = strs[0].charAt(i);
            }
            catch (IndexOutOfBoundsException e){
                return strs[0].substring(0, minLength);
            }
            for(String str : strs){
                try{
                    if(str.charAt(i) != current)  return strs[0].substring(0, minLength);
                }
                catch (IndexOutOfBoundsException e){
                    return strs[0].substring(0, minLength);
                }
            }
            minLength++;
            i++;
        }
    }


    /*public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int currentLength = 0;
        int minLength = Integer.MAX_VALUE;
        String template = strs[0];
        for (String str : strs) {
            for (int j = 0; j < Math.min(str.length(), template.length()); j++) {
                if (str.charAt(j) == template.charAt(j)) currentLength++;
                else break;
            }
            minLength = Math.min(minLength, currentLength);
        }
        return template.substring(0, minLength);
    }*/
}
