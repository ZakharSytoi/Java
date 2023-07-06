package org.example;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> uniqueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(uniqueMap.containsKey(target - nums[i])){
                return new int[]{uniqueMap.get(target - nums[i]), i};
            }
            else uniqueMap.put(nums[i], i);
        }
        return nums;
    }

    // The idea is to use HashMap like Set to store values but to have access to their
    // original indexes in the same time. So if we find some number x such that target - x = y
    // exists in our set then y + x = target, and we can return indexes of x and y
    // like i and value corresponding to y in HashMap

    // binary search
    /*leftBorder = 0;
    rightBorder = i;
                while (leftBorder<rightBorder){
        midIndex = (leftBorder + rightBorder)/2;
        if(nums[midIndex] == target - nums[i]) return new int[] {midIndex, i};
        else if (target - nums[i] < midIndex) {
            rightBorder = midIndex;
        }
        else leftBorder = midIndex;
    }*/
}
