package org.example.medium;

/**
 * Problem description: https://leetcode.com/problems/integer-to-roman/description/
 * Status: SOLVED
 * Time complexity: O(1)
 */

public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String [] romanNums = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int [] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for(int i = 0; i < romanNums.length; i++) {
            for(int j = 0; j < num/nums[i]; j++) {
                sb.append(romanNums[i]);
            }
            num%=nums[i];
        }
        return sb.toString();
    }
}
