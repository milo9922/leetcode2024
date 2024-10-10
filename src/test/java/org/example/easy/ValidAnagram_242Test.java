package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram_242Test {

    @Test
    void shouldReturnTrueIfAnagram() {
        String firstInput = "anagram";
        String secondInput = "nagaram";
        var validAnagram  = new ValidAnagram_242();
        assertTrue(validAnagram.isAnagram(firstInput, secondInput));
    }

    @Test
    void shouldReturnFalseIfNotAnagram() {
        String firstInput = "rat";
        String secondInput = "car";
        var validAnagram  = new ValidAnagram_242();
        assertFalse(validAnagram.isAnagram(firstInput, secondInput));
    }
}