package org.example.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition_35Test {
    @Test
    void shouldReturnIndexOfTargetInGivenArray() {
        int [] nums = {1, 3, 5, 6};
        int target = 5;

        SearchInsertPosition_35 searchInsertPosition35 = new SearchInsertPosition_35();
        int result = searchInsertPosition35.searchInsert(nums, target);

        assertEquals(2, result);
    }

    @Test
    void shouldReturnFittingIndexToInsertTargetInOrder() {
        int [] nums = {1, 3, 5, 6};
        int target = 2;

        SearchInsertPosition_35 searchInsertPosition35 = new SearchInsertPosition_35();
        int result = searchInsertPosition35.searchInsert(nums, target);

        assertEquals(1, result);
    }
}