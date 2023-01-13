package com.djn.algorithm.array.binarysearch;

import org.junit.Test;
import static org.junit.Assert.*;


public class SearchInsertPositionTest {
    @Test
    public void testBinaryClosedSearchPos() {
        int[] arr = {1, 3, 5, 6}; // 有序数组
        int[] target = {5, 2, 7, 0}; //目标值
        int[] rightRes = {2, 1, 4, 0}; //正确结果
        int res = 0;

        for(int i = 0; i < target.length; i++) {
            res = SearchInsertPosition.binaryClosedSearchPos(arr, target[i]);
            assertEquals("return index is false",res, rightRes[i]);
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
            assertEquals("result is false", res, rightRes[i]);
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
            assertEquals("result is false", res, rightRes[i]);
        }
    }
}
