package com.djn.algorithm.array.deleteelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MoveZeroTest {
    @Test
    public void testTpMoveZero() {
        int[] nums = {0 ,1, 0, 3, 12};
        MoveZero.tpMoveZero(nums);
        int[] target = {1, 3, 12, 0, 0};

        assertArrayEquals(target, nums, "移动结果不正确");
    }
}
