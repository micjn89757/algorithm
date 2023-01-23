package com.djn.algorithm.array.binarysearch;


/**
 * !leetcode题目27: 移除元素
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 实际上实现方法中没有改变元素的相对位置
 *
 * 示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2: 给定 nums = [0,1,2,2,3,0,4,2], val = 2, 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 */
public class DeleteElement {

    /**
     * !暴力解法
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     *
     * 两层for循环，一个for循环遍历数组元素第二个循环更新数组
     *
     * 不仅要返回移除后数组的新长度，还要原地修改nums数组
     * @param nums 数组
     * @param val 需要删除的值
     * @return 数组的新长度
     */
    public static int simpleRemoveElement(int[] nums, int val) {
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            // 找到元素
            if (val == nums[i]) {
                for (int j = i + 1; j < size; j++) {
                    nums[j - 1] = nums[j];
                }
                i--; // !因为下标i以后的数值都向前移动了一位，所以i也要向前移动一位，不能忽略
                size--;
            }
        }

        return size;
    }

    /**
     * !双指针法
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * 通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。
     *
     * 此题使用双指针法，快慢指针在寻找过程中如果没有找到val的时候同时移动
     * 一旦出现val, 慢指针停在val上，快指针找到后面第一个不是val的，填充慢指针指定的位置
     * 慢指针对应元素赋值后会立即++，所以慢指针最后的值就是返回的新数组size
     */
    public static int pointRemoveElement(int[] nums, int val) {
        int slowPoint = 0;
        for (int fastPoint = 0; fastPoint < nums.length; fastPoint++) {
            if (val != nums[fastPoint]) {
                nums[slowPoint++] = nums[fastPoint];
            }
        }

        return slowPoint;
    }
}
