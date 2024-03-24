package org.example.arrays.easy;

/**
 * Problem description: https://leetcode.com/problems/number-of-good-pairs/description/
 * Status: SOLVED
 */
public class NumberOfGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int resultsNum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    resultsNum++;
                }
            }
        }
        return resultsNum;
    }
}
