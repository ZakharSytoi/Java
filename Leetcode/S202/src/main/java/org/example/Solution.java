package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        int currentSum = 0;
        Set<Integer> uniqueSet = new HashSet<>();
        while(currentSum != 1){
            currentSum = 0;
            while(n!=0){
                currentSum += Math.pow(n%10, 2);
                n = n / 10;
            }
            if(uniqueSet.contains(currentSum))return false;
            uniqueSet.add(currentSum);
            n = currentSum;
        }
        return true;
    }
}
