package com.djn.algorithm.array.sortedsquare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void originSortedSquaresTest() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] target = {0, 1, 9, 16, 100};

        assertArrayEquals(Solution.originSortedSquares(nums), target, "结果不正确");
    }

    @Test
    public void tpSortedSquaresTest() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] target = {0, 1, 9, 16, 100};

        assertArrayEquals(Solution.tpSortedSquares(nums), target, "结果不正确");
    }
}
