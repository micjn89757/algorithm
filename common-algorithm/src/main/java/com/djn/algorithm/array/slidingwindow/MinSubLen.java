package com.djn.algorithm.array.slidingwindow;

/**
 * !leetcode209.长度最小的子数组
 *
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3] 输出：2 解释：子数组 [4,3] 是该条件下的长度最小的子数组
 *
 * !思路:
 * 1. 暴力解法
 * 2. 滑动窗口
 */
public class MinSubLen {

    /**
     * !暴力解法
     * 时间复杂度O(n^2)
     * 空间复杂度O(1)
     *
     * @param target 正整数
     * @param nums 含有n个正整数的数组
     * @return 子数组长度
     */
    public static int minSubArrayLen(int target, int[] nums) {
         int resLen = 999999;
         int subLen = 0;
         int sum = 0;
         for (int i = 0; i < nums.length; i++) {
             sum = 0;
             subLen = 0;
             for (int j = i; j < nums.length; j++) {
                 sum += nums[j];
                 subLen++;
                 if (sum >= target) {
                     resLen = Math.min(resLen, subLen);
                     break;
                 }
             }
         }

         return resLen == 999999 ? 0 : resLen;
    }
}
