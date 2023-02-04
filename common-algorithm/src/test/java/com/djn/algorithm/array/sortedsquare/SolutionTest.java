package com.djn.algorithm.array.sortedsquare;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void originSortedSquaresTest() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] target = {0, 1, 9, 16, 100};

        assertArrayEquals("结果不正确",Solution.originSortedSquares(nums), target);
    }

    @Test
    public void tpSortedSquaresTest() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] target = {0, 1, 9, 16, 100};

        assertArrayEquals("结果不正确",Solution.tpSortedSquares(nums), target);
    }
}
