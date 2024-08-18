package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfAString_3110Test {

    @Test
    void shouldCountCorrectScoreForFirstWord() {
        String word = "hello";
        int expectedScore = 13;
        var scoreOfTheString_3110 = new ScoreOfAString_3110();
        int actualScore = scoreOfTheString_3110.scoreOfString(word);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void shouldCountCorrectScoreForSecondWord() {
        String word = "zaz";
        int expectedScore = 50;
        var scoreOfTheString_3110 = new ScoreOfAString_3110();
        int actualScore = scoreOfTheString_3110.scoreOfString(word);
        assertEquals(expectedScore, actualScore);
    }
}