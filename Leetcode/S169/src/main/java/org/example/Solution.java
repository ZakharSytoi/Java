package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
    // the idea is that the element which appears more that n/2 times
    // will always show up in the middle



    /*public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(Integer i: nums){
            if(elements.containsKey(i)){
                elements.put(i, elements.get(i)+1);
            }
            else elements.put(i, 1);
        }
        return elements.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }*/

    //My initial solution. Ineffective due to finding the most common element,
    // not the element that takes n/2 of array space.

}
