package org.example;

public class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            maxVol = Math.max(Math.min(height[right], height[left]) * (right-left), maxVol);
            if(height[left] <= height[right]){
                left++;
            }
            else right--;
        }
        return maxVol;
    }
}
