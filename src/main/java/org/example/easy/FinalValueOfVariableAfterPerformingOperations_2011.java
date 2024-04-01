package org.example.easy;

/**
 * Problem description: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 * Status: SOLVED
 */
public class FinalValueOfVariableAfterPerformingOperations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X":
                case "X--":
                    x--;
                    break;
                case "X++":
                case "++X":
                    x++;
                    break;
            }
        }
        return x;
    }
}
