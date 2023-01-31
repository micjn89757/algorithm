package com.djn.algorithm.array.deleteelement;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class MoveZeroTest {
    @Test
    public void testTpMoveZero() {
        int[] nums = {0 ,1, 0, 3, 12};
        MoveZero.tpMoveZero(nums);
        int[] target = {1, 3, 12, 0, 0};

        assertArrayEquals("移动结果不正确",target, nums);
    }
}
