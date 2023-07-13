package org.example;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if(start == i){
                result.add(String.valueOf(nums[start]));
            }
            else {
                result.add(nums[start] +"->"+ nums[i]);
            }
            start = i+1;
        }
        return result;
    }
}
