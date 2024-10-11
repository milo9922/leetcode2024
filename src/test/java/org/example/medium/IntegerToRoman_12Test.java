package org.example.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IntegerToRoman_12Test {

    @Test
    void shouldReturnNumberConverterToRoman() {
        int num = 3749;
        String expected = "MMMDCCXLIX";
        IntegerToRoman_12 integerToRoman12 = new IntegerToRoman_12();
        assertEquals(expected, integerToRoman12.intToRoman(num));
    }
}
