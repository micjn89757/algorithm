package com.djn.algorithm.array.deleteelement;

/**
 * !leetcode283.移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * !注意，必须在不复制数组的情况下原地对数组进行操作。
 *
 * !主要思路
 * 力扣官方的题解思路：
 * 使用双指针，在移动结束时左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
 *
 * 右指针不断向右移动，每次右指针指向非零数，则将左右指针对应的数交换，同时左指针右移。
 *
 * 注意到以下性质：
 *    左指针左边均为非零数；
 *    右指针左边直到左指针处均为零。
 *
 * 因此每次交换，都是将左指针的零与右指针的非零数交换，且非零数的相对顺序并未改变。
 */
public class MoveZero {
    /**
     * !双指针法
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * @param nums 需要进行移动的数组
     */
    public static void tpMoveZero(int[] nums) {
        int size = nums.length;
        int left = 0;
        int right = 0;

        while (right < size) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }

            right++;
        }
    }

    /**
     * 交换数组中的两个元素
     * @param nums 需要进行交换的数组
     * @param left 需要进行交换的第一个元素的index
     * @param right 需要进行交换的第二个元素的index
     */
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
