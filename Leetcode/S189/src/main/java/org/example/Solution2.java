package org.example;


public class Solution2 {
    public void rotate(int[] nums, int k) {
        if (k == 0) return;
        if (k > nums.length) k = k % nums.length; //if we roll the circle more than it's length then we rotate it
                                                 // one n times + reminder which is actual rotation number
        int[] nums2 = new int[nums.length];
        int index = nums.length - k;
        int position = 0;
        for (int i = index; i < nums.length; i++) {
            nums2[position] = nums[i];
            position++;
        }
        for (int i = 0; i < index; i++) {
            nums2[position] = nums[i];
            position++;
        }
        System.arraycopy(nums2, 0, nums, 0, nums.length);
    }
    // copy end part of an array then copy begin part. result array copy to
}
