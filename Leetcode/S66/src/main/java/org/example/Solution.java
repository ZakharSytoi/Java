package org.example;


public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int index = 1;
        int tmpDigit;
        do {
            tmpDigit = digits[digits.length - index] + carry;
            carry = (tmpDigit) / 10;
            digits[digits.length - index] = tmpDigit % 10;
            index++;
        } while (carry != 0 && index <= digits.length);
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for (int i = 1; i < digits.length; i++) {
                newDigits[i] = digits[digits[i]];
            }
            return newDigits;
        }
        return digits;
    }
}
