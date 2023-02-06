package com.djn.algorithm.array.binarysearch;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BinarySearchTest {
    @Test
    public void testClosedIntervalSearchResult() {
        // input
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        // trueOutput:the index of 9 is 4
        int trueResult = 4;

        int result = BinarySearch.closedIntervalBinarySearch(nums, target);
        assertEquals(result, trueResult);
    }

    @Test
    public void testOpenIntervalSearchResult() {
        // input
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        // trueOutput:the index of 9 is 4
        int trueResult = 4;

        int result = BinarySearch.openIntervalBinarySearch(nums, target);
        assertEquals(result, trueResult);
    }
}
