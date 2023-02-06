package com.djn.algorithm.array.deleteelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteElementTest {
    @Test
    public void testSimpleRemoveElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = DeleteElement.simpleRemoveElement(nums, 2);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, res,"删除后数组长度不符");

        assertArrayEquals(new int[]{0,1,3,0,4,2,2,2}, nums, "删除后数组内容不符");
    }

    @Test
    public void testPointRemoveElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = DeleteElement.pointRemoveElement(nums, 2);
        System.out.println(Arrays.toString(nums));
        assertEquals(5, res, "删除后数组长度不符");

        assertArrayEquals(new int[]{0,1,3,0,4,0,4,2}, nums, "删除后数组内容不符");
    }
}
