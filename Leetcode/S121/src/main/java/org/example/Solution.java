package org.example;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int maxPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            if(minPrice > prices[i]){
                minPrice = prices[i];
                maxPrice = 0;
                continue;
            }
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - minPrice);
        }
        return maxProfit;
    }
}