package com.djn.algorithm.array.binarysearch;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DeleteElementTest {
    @Test
    public void testSimpleRemoveElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = DeleteElement.simpleRemoveElement(nums, 2);
        System.out.println(Arrays.toString(nums));
        assertEquals("删除后数组长度不符",5, res);

        assertArrayEquals("删除后数组内容不符", new int[]{0,1,3,0,4,2,2,2}, nums);
    }

    @Test
    public void testPointRemoveElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = DeleteElement.pointRemoveElement(nums, 2);
        System.out.println(Arrays.toString(nums));
        assertEquals("删除后数组长度不符",5, res);

        assertArrayEquals("删除后数组内容不符", new int[]{0,1,3,0,4,0,4,2}, nums);
    }
}
