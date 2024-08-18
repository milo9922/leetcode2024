package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefangingAnIPAddress_1108Test {
    @Test
    void shouldReturnDefangedVersionOfFirstIPAddress() {
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        var defangingAnIPAddress_1108 = new DefangingAnIPAddress_1108();
        String actual = defangingAnIPAddress_1108.defangIPaddr(address);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnDefangedVersionOfSecondIPAddress() {
        String address = "255.100.50.0";
        String expected = "255[.]100[.]50[.]0";
        var defangingAnIPAddress_1108 = new DefangingAnIPAddress_1108();
        String actual = defangingAnIPAddress_1108.defangIPaddr(address);
        assertEquals(expected, actual);
    }

}