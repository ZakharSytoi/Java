package org.example;

import java.util.*;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(tmp);
                        resultSet.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
