package org.example.medium;

/**
 * Problem description: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 * Status: SOLVED
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox_1769 {

    // O(n) = n^2
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] distances = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(boxes.charAt(j) == '1') {
                    distances[i] += Math.abs(i - j);
                }
            }
        }
        return distances;
    }

    // O(n) = n
    public static int[] suffixCountApproach(String boxes) {
        int n = boxes.length();
        int[] distances = new int[n];

        int prefixCount = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; ++i) {
            distances[i] = prefixCount * i - prefixSum;
            if (boxes.charAt(i) == '1') {
                ++prefixCount;
                prefixSum += i;
            }
        }

        int suffixCount = 0;
        int suffixSum = 0;

        for (int i = n - 1; i >= 0; --i) {
            distances[i] += suffixSum - suffixCount * i;
            if (boxes.charAt(i) == '1') {
                ++suffixCount;
                suffixSum += i;
            }
        }

        return distances;
    }
}
