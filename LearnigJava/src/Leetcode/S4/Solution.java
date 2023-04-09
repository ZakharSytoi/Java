package Leetcode.S4;

public class Solution {


    public int maxArea(int[] height) {
        int maxVolume = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            maxVolume = Math.max(Math.min(height[left], height[right]) * (right - left), maxVolume);
            if (height[left] > height[right]) {
                right--;
            } else left++;
        }
        return maxVolume;
    }
}
