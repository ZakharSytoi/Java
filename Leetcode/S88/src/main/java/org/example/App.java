package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //int[] nums1 = {4,0,0,0,0,0};
        //int [] nums2 = {1,2,3,5,6};
        //int m =1, n = 5;
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1, n = 1;
        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
    }
}
