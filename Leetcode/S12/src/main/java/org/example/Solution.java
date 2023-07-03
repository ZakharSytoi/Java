package org.example;

public class Solution {
    public String intToRoman(int num) {
        String[] romanArray = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] intArray = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int position = 0;
        while (num > 0) {
            if (num - intArray[position] >= 0) {
                num -= intArray[position];
                result.append(romanArray[position]);
            }
            else position++;
        }
        return result.toString();
    }
}
