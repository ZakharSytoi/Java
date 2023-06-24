package org.example;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        int count1 = 0, count2 = 0;
        for (int i = 0; i < m+n; i++) {
            if (nums1[count1] > nums2[count2]) {
                insert(nums1, count1, m+n, nums2[count2]);
                count1++;
                count2++;
                if(count2 == n) return;
            } else count1++;
        }
        for (int i = m + count2; i < n + m; i++) {
            nums1[i] = nums2[count2];
            count2++;
        }
    }

    private void insert(int[] nums, int position, int length, int number) {
        for (int i = length - 1; i > position; i--) {
            nums[i] = nums[i-1];
        }
        nums[position] = number;
    }
}
