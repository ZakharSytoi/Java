package org.example;

public class Solution {
    /*public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int totalProfit = 0;
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
            if(i < prices.length - 1 && prices[i] > prices[i+1] || i == prices.length - 1){
                totalProfit += maxProfit;
                maxProfit =0;
                minPrice = prices[i];
            }
        }
        return totalProfit;
    }*/
    // my solution is based on the previous one, but the better way is
    // to get profit every time it can be made, and add it.
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            } else {
                totalProfit += price - minPrice;
                minPrice = price;
            }
        }
        return totalProfit;
    }


}
