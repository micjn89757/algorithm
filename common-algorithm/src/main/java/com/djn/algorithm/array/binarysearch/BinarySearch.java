package com.djn.algorithm.array.binarysearch;


/**
 * !leetcode704.二分查找
 * !二分搜索的前提是有序数组(题目中提到有序数组都可以考虑),关键在于区间定义要想清楚
 * !坚持循环不变量的原则
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，
 * 写一个函数搜索nums中的target，
 * 如果目标值存在返回下标，否则返回 -1
 */
public class BinarySearch {
    /**
     * 根据二分搜索寻找对应元素下标, [left,right]闭区间
     * 初始位置left = 0, right = length - 1
     * 若找不到目标值，循环终止条件left > right
     * @param numbs 一个有序且无重复元素的数组，因为一旦有重复元素，使用二分查找法返回的元素下标可能不是唯一的
     * @param target 要查找的目标值
     * @return 目标值的索引，若找不到目标值返回-1
     */
    public static int closedIntervalBinarySearch(int[] numbs, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < numbs[0] || target > numbs[numbs.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = numbs.length - 1; // 定义target在左闭右闭区间里
        int middle;

        while(left <= right) {
             // middle = (left + right) / 2;
             // 等同于上式，但是能防止left + right超过int类型最大值，也就是能防止数据溢出
             middle = left + (right - left) / 2;
             if(numbs[middle] == target) {
                 return middle; // 查找成功返回index
             }else if(numbs[middle] < target) {
                 left = middle + 1; // 查找右区间
             }else {
                 right = middle - 1;// 查找左区间
             }
        }

        // 没有找到就返回-1
        return -1;
    }

    /**
     * 根据二分搜索寻找对应元素下标, [left,right)开区间
     * 初始位置left = 0, right
     * 若找不到目标值，终止条件left == right
     * @param numbs 一个有序且无重复元素的数组，因为一旦有重复元素，使用二分查找法返回的元素下标可能不是唯一的
     * @param target 要查找的目标值
     * @return 目标值的索引，若找不到目标值返回-1
     */
    public static int openIntervalBinarySearch(int[] numbs, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < numbs[0] || target > numbs[numbs.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = numbs.length; // 定义target在左闭右开区间里
        int middle;
        // 边界条件
        while(left < right) {
             middle = left + (right - left) / 2;
             if(numbs[middle] == target) {
                 return middle; // 查找成功返回index
             }else if(numbs[middle] < target) {
                 left = middle + 1; // 查找右区间
             }else {
                 right = middle;// 查找左区间
             }
        }

        // 没有找到就返回-1
        return -1;
    }
}
