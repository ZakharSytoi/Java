package org.example;

public class Solution_Ethalon {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    //idea ia that we rewrite all the _val in the middle
    // by moving index only when we rewrite and moving
    // i every time.
}
