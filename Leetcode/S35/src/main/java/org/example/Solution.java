package org.example;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int index;
        if (target <= nums[0]) return 0;
        while (right - left != 1) {
            index = (right + left) / 2;
            if (nums[index] == target) return index;
            else if (nums[index] > target) {
                right = index;
            } else left = index;
        }
        return right;
    }
}
