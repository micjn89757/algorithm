package com.djn.algorithm.array.binarysearch;

/**
 * !leetcode题目35.搜索插入位置
 * 给定一个排序数组和一个目标值
 * 在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 假设数组中无重复元素
 *
 * !主要考虑四种情况
 * 目标值在数组所有元素之前
 * 目标值等于数组中某一个元素
 * 目标值插入数组中的位置
 * 目标值在数组所有元素之后
 *
 * !方法
 * 主要使用二分搜索，注意二分搜索的关键问题，在BinarySearch.java有提到
 * 二分搜索在某些情况下不一定就比暴力快，看实现方式
 */
public class SearchInsertPosition {

    /**
     * !使用二分查找(左闭右闭)思想解决
     * 时间复杂度 O(log n)
     * 空间复杂度 O(1)
     *
     * @param arr 有序数组
     * @param target 目标值
     * @return 找到目标值则返回其索引，否则返回其将被插入的位置
     */
    public static int binaryClosedSearchPos(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;

        while(left <= right) {
            middle = left + (right - left) / 2;
            if(arr[middle] == target) {
                return middle;
            }else if(arr[middle] > target) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return left;
    }

    /**
     * !使用二分查找(左闭右开)思想解决
     * 时间复杂度O(log n)
     * 空间复杂度O(1)
     *
     * @param arr 有序数组
     * @param target 目标值
     * @return 找到目标值则返回其索引，否则返回其将被插入的位置
     */
    public static int binaryOpenSearchPos(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int middle = 0;

        while(left < right) {
            middle = (left + right) / 2;
            if(arr[middle] == target) {
                return middle;
            }else if(arr[middle] > target) {
                right = middle;
            }else {
                left = middle + 1;
            }
        }

        return right;
    }

    /**
     * !暴力查找
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param arr 有序数组
     * @param target 目标值
     * @return 找到目标值则返回其索引，否则返回其将被插入的位置
     */
    public static int searchPos(int[] arr, int target) {
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            //如果当前值大于等于target，索引即为i
            if(arr[i] >= target) return i;
        }

        // 目标在所有元素之后
        return len;


    }
}
