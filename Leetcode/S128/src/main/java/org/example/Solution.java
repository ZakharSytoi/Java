package org.example;

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxCount = 0;
        int currentCount = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) continue;
            if(nums[i] == nums[i+1]-1) currentCount++;
            else {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(currentCount, maxCount);
        return maxCount;
    }
}

// effective but not honest solution
