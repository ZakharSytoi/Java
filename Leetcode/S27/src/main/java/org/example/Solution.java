package org.example;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int actual = nums.length - 1;
        int tailLength = 0;
        int swapNumber;
        while (actual != -1) {
            if (nums[actual] == val) {
                if(actual == nums.length - tailLength - 1){
                    tailLength++;
                    actual--;
                    continue;
                }
                swapNumber = nums[nums.length - tailLength - 1];
                nums[nums.length - tailLength - 1] = nums[actual];
                nums[actual] = swapNumber;
                tailLength++;
            }
            actual--;
        }
        return nums.length - tailLength;
    }
}

