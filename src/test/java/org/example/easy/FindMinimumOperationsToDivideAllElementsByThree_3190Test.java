package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumOperationsToDivideAllElementsByThree_3190Test {

    @Test
    void shouldReturnMinimumNumberOfOperationsToMakeAllElementsOfArrayDivisibleByThree() {
        int [] nums = {1, 2, 3, 4};
        int result = new FindMinimumOperationsToDivideAllElementsByThree_3190().minimumOperations(nums);
        assertEquals(3, result);
    }

    @Test
    void shouldReturnZeroForAllArrayElementsDivisibleByThree() {
        int [] nums = {3, 6, 9};
        int result = new FindMinimumOperationsToDivideAllElementsByThree_3190().minimumOperations(nums);
        assertEquals(0, result);
    }
}