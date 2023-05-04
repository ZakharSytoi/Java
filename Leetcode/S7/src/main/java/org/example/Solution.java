package org.example;

public class Solution {
    public int reverse(int x) {
        short tmpNum;
        int result = 0;
        while (x != 0) {
            tmpNum = (short) (x % 10);
            x = x / 10;
            try {
                result = Math.addExact(result, tmpNum);
            } catch (ArithmeticException e) {
                return 0;
            }
            try {
                result = Math.multiplyExact(result, 10);
            } catch (ArithmeticException e) {
                if (x == 0)
                    return result;
                else return 0;
            }
        }
        if (result / 10 != 0) {
            result = result / 10;
        }
        return result;
    }
}
