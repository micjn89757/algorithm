package com.djn.algorithm.array.sortedsquare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * !leetcode977.有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 * 示例 1： 输入：nums = [-4,-1,0,3,10] 输出：[0,1,9,16,100] 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100]
 *
 * 示例 2： 输入：nums = [-7,-3,2,3,11] 输出：[4,9,9,49,121]
 *
 * !思路
 * 1. 暴力解法：先平方再排序
 * 2. 双指针法:
 * 数组其实是有序的，只不过负数平方之后可能成为最大数了,
 * 那么数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间。
 * 此时可以考虑双指针法了，i指向起始位置，j指向终止位置。
 */
public class Solution {

    /**
     * !暴力解法
     * 时间复杂度O(nlogn), 实际上取决于用的排序算法
     * 空间复杂度O(1)
     *
     * 每个数平方之后，排序
     *
     * @param nums 非递减顺序的数组
     * @return 有序数组的平方(也是有序)
     */
    public static int[] originSortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // 这里使用的应该是快排
        Arrays.sort(nums);

        return nums;
    }


    /**
     * !双指针法
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * 定义一个新数组result，和A数组一样的大小，让k指向result数组终止位置。
     *
     * 如果A[i] * A[i] < A[j] * A[j] 那么result[k--] = A[j] * A[j]
     *
     * 如果A[i] * A[i] >= A[j] * A[j] 那么result[k--] = A[i] * A[i]
     * 注意终止条件即可
     *
     */
    public static int[] tpSortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = j;
        int[] result = new int[nums.length];

        while(i < j) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                result[k--] = nums[j] * nums[j];
                j--;
            }else {
                result[k--] = nums[i] * nums[i];
                i++;
            }
        }

        result[k] = nums[i] * nums[i];

        return result;
    }
}
