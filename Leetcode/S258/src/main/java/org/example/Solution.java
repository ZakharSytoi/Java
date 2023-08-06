package org.example;

public class Solution {
    public int addDigits(int num) {
        int currentSum = 11;
        while(currentSum > 10){
            currentSum = 0;
            while(num > 0){
                currentSum += num % 10;
                num = num / 10;
            }
            num = currentSum;
        }
        return currentSum;
    }
}
