package org.example.easy;

import java.util.*;

/**
 * Problem description: https://leetcode.com/problems/valid-anagram/description/
 * Status: SOLVED
 */

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        char [] sChars = s.toCharArray();
        char [] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}
