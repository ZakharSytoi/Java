package org.example;

public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] > nums[1]) return nums[0];
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums[nums.length - 1];
        int left = 1;
        int right = nums.length - 2;
        int index;
        while (left <= right) {
            index = (left + right) / 2;
            if (nums[index + 1] > nums[index]) {
                left = index + 1;
            } else if (nums[index - 1] > nums[index]){
                right = index - 1;
            }
            else return index;
        }
        return 0;
    }
}
