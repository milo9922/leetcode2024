package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutation_1920Test {

    @Test
    void shouldBuildArrayFromFirstPermutation() {
        var buildArrayFromPermutation1920 = new BuildArrayFromPermutation_1920();
        int[] input = {0,2,1,5,3,4};
        int[] expected = {0,1,2,4,5,3};
        assertArrayEquals(expected, buildArrayFromPermutation1920.buildArray(input));
    }

    @Test
    void shouldBuildArrayFromSecondPermutation() {
        var buildArrayFromPermutation1920 = new BuildArrayFromPermutation_1920();
        int[] input = {5,0,1,2,3,4};
        int[] expected = {4,5,0,1,2,3};
        assertArrayEquals(expected, buildArrayFromPermutation1920.buildArray(input));
    }
}