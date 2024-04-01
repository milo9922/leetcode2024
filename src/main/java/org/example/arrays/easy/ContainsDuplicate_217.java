package org.example.arrays.easy;

import java.util.HashMap;

/**
 * Problem description: https://leetcode.com/problems/contains-duplicate/
 * Status: SOLVED
 */
public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int value : nums) {
            if(numsMap.containsKey(value)) {
                return true;
            }
            numsMap.put(value, null);
        }
        return false;
    }
}
