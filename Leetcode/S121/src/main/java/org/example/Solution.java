package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int actualIndexOfMinElement;
        int maxLocalElement;
        ArrayList<Integer> tmpList = new ArrayList<Integer>();
        int maxProfit = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int price : prices) {
            list.add(price);
        }

        Arrays.sort(prices);

        for (int minPrice : prices) {
            if ((actualIndexOfMinElement = list.indexOf(minPrice)) == list.size() - 1) {
                return maxProfit;
            }
            else{
                maxLocalElement = 0;
                for(int i = actualIndexOfMinElement+1; i < list.size(); i++){
                    tmpList.add(list.get(i));
                }
                for (Integer integer : tmpList) {
                    if (integer > maxLocalElement) maxLocalElement = integer;
                }
                if(maxProfit < maxLocalElement - minPrice){
                    maxProfit = maxLocalElement - minPrice;
                }
                list.remove(actualIndexOfMinElement);
                tmpList.clear();
            }
        }

        return maxProfit;
    }
}