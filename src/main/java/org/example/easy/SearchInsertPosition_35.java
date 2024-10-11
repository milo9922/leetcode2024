package org.example.easy;

/**
 * Problem description: https://leetcode.com/problems/search-insert-position/description/
 * Status: SOLVED
 * Time complexity: O(log n)
 */

public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int middle = (left + right)/2;
            if(nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return right;
    }
}
