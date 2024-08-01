package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArray_1929Test {
    @Test
    void shouldConcatFirstArrayIntoTwoArrays() {
        int [] input = {1, 2, 1};
        int [] expected = {1, 2, 1, 1, 2, 1};
        var concatenationOfArray = new ConcatenationOfArray_1929();
        assertArrayEquals(expected, concatenationOfArray.getConcatenation(input));
    }

    @Test
    void shouldConcatSecondArrayIntoTwoArrays() {
        int [] input = {1, 3, 2, 1};
        int [] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        var concatenationOfArray = new ConcatenationOfArray_1929();
        assertArrayEquals(expected, concatenationOfArray.getConcatenation(input));
    }

}