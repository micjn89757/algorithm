package com.djn.algorithm.array.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * 测试左右边界方法时候注意特殊情况取值
 */
public class FindFirstLastPositionTest {
    public static final int[] INPUT_NUMS = new int[]{5, 7, 7, 8, 8, 10};
    public static final int TARGET = 8;
    public static final int[] TRUE_RANGE = new int[]{3, 4};
    @Test
    public void testBinarySearchRange() {
        int[] resRange = FindFirstLastPosition.binarySearchRange(INPUT_NUMS, TARGET);

        assertArrayEquals(resRange, TRUE_RANGE);
    }

    @Test
    public void testGetRightBorder() {
        int resRightBorder = FindFirstLastPosition.getRightBorder(INPUT_NUMS, TARGET) - 1;

        assertEquals(resRightBorder, TRUE_RANGE[1]);
    }

    @Test
    public void testGetLeftBorder() {
        int resLeftBorder = FindFirstLastPosition.getLeftBorder(INPUT_NUMS, TARGET) + 1;

        assertEquals(resLeftBorder, TRUE_RANGE[0]);
    }
}
