package com.djn.algorithm.array.slidingwindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSubLenTest {
    @Test
    public void testOriMinSubArrLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        assertEquals(2, MinSubLen.oriMinSubArrLen(target, nums));
    }

    @Test
    public void testSlidingWindowSubArrLen() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        assertEquals(2, MinSubLen.slidingWindowSubArrLen(target, nums));
    }
}
