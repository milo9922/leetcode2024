package org.example.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToMoveAllBallsToEachBox_1769Test {

    @Test
    void shouldCountFirstBoxOperationsCorrectly() {
        String input = "110";
        int [] expected = {1, 1, 3};
        int [] actual = MinimumNumberOfOperationsToMoveAllBallsToEachBox_1769.minOperations(input);
        assertEquals(expected[0], actual[0]);
    }

    @Test
    void shouldCountAllOperationsCorrectly() {
        String input = "001011";
        int [] expected = {11, 8, 5, 4, 3, 4};
        int [] actual = MinimumNumberOfOperationsToMoveAllBallsToEachBox_1769.minOperations(input);
        assertArrayEquals(expected, actual);
    }

}