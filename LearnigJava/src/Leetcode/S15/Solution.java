package Leetcode.S15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        boolean flag2 = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> tmp = new ArrayList<Integer>(3);
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);

                        if(nums[i] == 0 && nums[j] == 0 && nums[k] == 0 && flag2) {
                            resultList.add(tmp);
                            flag2 = false;
                            continue;
                        }
                        boolean flag = false;
                        for (List<Integer> instance:
                             resultList) {
                            if(new HashSet<>(instance).containsAll(tmp)){
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            resultList.add(tmp);
                        }

                    }
                }
            }
        }
        return resultList;
    }
}
