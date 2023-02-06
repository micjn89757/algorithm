package com.djn.algorithm.array.binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class SearchInsertPositionTest {
    @Test
    public void testBinaryClosedSearchPos() {
        int[] arr = {1, 3, 5, 6}; // 有序数组
        int[] target = {5, 2, 7, 0}; //目标值
        int[] rightRes = {2, 1, 4, 0}; //正确结果
        int res = 0;

        for(int i = 0; i < target.length; i++) {
            res = SearchInsertPosition.binaryClosedSearchPos(arr, target[i]);
            assertEquals(res, rightRes[i], "return index is false");
        }
    }

    @Test
    public void testBinaryOpenSearchPos() {
        int[] arr = {1, 3, 5, 6}; // 有序数组
        int[] target = {5, 2, 7, 0}; //目标值
        int[] rightRes = {2, 1, 4, 0}; //正确结果
        int res = 0;

        for(int i = 0; i < target.length; i++) {
            res = SearchInsertPosition.binaryOpenSearchPos(arr, target[i]);
            assertEquals(res, rightRes[i], "result is false");
        }
    }

    @Test
    public void testSearchPos() {
        int[] arr = {1, 3, 5, 6}; // 有序数组
        int[] target = {5, 2, 7, 0}; //目标值
        int[] rightRes = {2, 1, 4, 0}; //正确结果
        int res = 0;

        for(int i = 0; i < target.length; i++) {
            res = SearchInsertPosition.searchPos(arr, target[i]);
            assertEquals(res, rightRes[i], "result is false");
        }
    }
}
