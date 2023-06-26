package org.example;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                if ((index - 1 < 0) || nums[index - 1] != nums[i]) {
                    nums[index + 1] = nums[i];
                    index++;
                }
            } else {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }


    /*public int removeDuplicates(int[] nums) {
        int totalLength = nums.length;
        int counter = -1;
        int rememberedNum = -1;
        boolean switcher = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                int j = i + 1;
                counter = 0;
                while (j < totalLength && nums[j] == nums[j - 1]) {
                    counter++;
                    j++;
                }
                j = i + 1;
                totalLength -= counter;
                if (counter > 0) {
                    while (j < nums.length - counter) {
                        nums[j] = nums[j + counter];
                        j++;
                    }
                    i++;
                }
            }
        }
        return totalLength;
    }*/
    // my initial solution. the idea is to find 2 same elements, then
    // find how many of them we have after our two that we need,
    // then move whole further array _count elements to the right
    // then subtract _count from whole length, so final we have less work to do on the next step
}