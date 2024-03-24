package org.example.arrays.easy;

/**
 * Problem description: https://leetcode.com/problems/build-array-from-permutation/description/
 * Status: SOLVED
 */
public class BuildArrayFromPermutation_1920 {
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
