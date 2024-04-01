package org.example.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem description: https://leetcode.com/problems/find-words-containing-character/description/
 * Status: SOLVED
 */
public class FindWordsContainingCharacter_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    indexes.add(i);
                    break;
                }
            }
        }
        return indexes;
    }
}
