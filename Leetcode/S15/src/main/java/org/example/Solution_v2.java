package org.example;

import java.util.*;

public class Solution_v2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> resultSet = new HashSet<>();
        int sum=0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                sum= nums[i]+nums[j]+nums[k];
                if (sum==0)
                    resultSet.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if (sum<0)
                    j++;
                else if (sum>0)
                    k--;
            }
        }
        return new ArrayList<>(resultSet);
    }
}