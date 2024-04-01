package org.example.easy;

/**
 * Problem description: https://leetcode.com/problems/shuffle-the-array/description/
 * Status: SOLVED
 */
public class ShuffleTheArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int [2*n];
        int idx = 0;
        for(int i = 0; i < nums.length; i+=2) {
            result[i] = nums[idx];
            result[i+1] = nums[n+idx];
            idx++;
        }
        return result;
    }
}