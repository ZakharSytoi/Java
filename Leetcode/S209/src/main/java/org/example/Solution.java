package org.example;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int startingPosition = 0;
        int currentSum = 0;
        int endPosition = 0;
        int minSubarrayLength = Integer.MAX_VALUE;
        while (startingPosition < nums.length) {
            if (currentSum < target && endPosition < nums.length) {
                currentSum += nums[endPosition];
                endPosition++;
            } else {
                if (currentSum >= target)
                    minSubarrayLength = Math.min(minSubarrayLength, endPosition - startingPosition);
                currentSum -= nums[startingPosition];
                startingPosition++;
            }

        }
        if (minSubarrayLength == Integer.MAX_VALUE) return 0;
        return minSubarrayLength;
    }
}
