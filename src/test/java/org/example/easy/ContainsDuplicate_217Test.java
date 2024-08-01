package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate_217Test {
    @Test
    void shouldReturnTrueForFirstArrayContainingDuplicate() {
        var containsDuplicate = new ContainsDuplicate_217();
        int [] input = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(input));
    }

    @Test
    void shouldReturnTrueForSecondArrayContainingDuplicate() {
        var containsDuplicate = new ContainsDuplicate_217();
        int [] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(containsDuplicate.containsDuplicate(input));
    }

    @Test
    void shouldReturnFalseForArrayNotContainingDuplicate() {
        var containsDuplicate = new ContainsDuplicate_217();
        int [] input = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(input));
    }
}