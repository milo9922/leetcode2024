package org.example.easy;

/**
 * Problem description: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/
 * Status: SOLVED
 */
public class FindMinimumOperationsToDivideAllElementsByThree_3190 {
    public int minimumOperations(int[] nums) {
        int operationsNum = 0;
        for(int n : nums) {
            if(n%3 != 0) {
                operationsNum++;
            }
        }
        return operationsNum;
    }
}
