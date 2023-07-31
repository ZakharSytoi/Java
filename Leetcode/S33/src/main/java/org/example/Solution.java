package org.example;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        if (nums[0] == target) return 0;
        if (nums[right] == target) return right;
        if (nums[0] > nums[nums.length - 1]) {
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] > nums[0]) {
                    left = middle + 1;
                } else if (nums[middle] < nums[nums.length - 1]) {
                    right = middle - 1;
                } else break;
            }
            if (target > nums[0]) {
                left = 0;
            } else right = nums.length - 1;
        }
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /*class Solution {
        public int search(int[] nums, int target) {
            int start = 0, end = nums.length - 1;
            int mid = (start + end) / 2;
            while (start <= end) {
                mid = (start + end) / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                if (nums[start] <= nums[mid]) {
                    if (nums[start] <= target && nums[mid] >= target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (nums[end] >= target && nums[mid] <= target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
    }*/
}