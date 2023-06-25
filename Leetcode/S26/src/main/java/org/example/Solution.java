package org.example;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        nums[index] = nums[nums.length - 1];
        index++;
        return index;
    }

    //Better way is to start index from 1 and compare
    //nums[i] and nums[i-1] so no need for extra lines after loop
}
