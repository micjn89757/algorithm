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
     * 两个for循环，不断的寻找符合条件的子序列
     * 但是这种解法超时了
     * @param target 正整数
     * @param nums 含有n个正整数的数组
     * @return 子数组长度
     */
    public static int oriMinSubArrLen(int target, int[] nums) {
         int resLen = 999999; // 最终返回的长度
         int subLen = 0; // 每次搜索的子序列长度
         int sum = 0; // 每次搜索的子序列的和
         for (int i = 0; i < nums.length; i++) {
             sum = 0;
             subLen = 0;
             for (int j = i; j < nums.length; j++) {
                 sum += nums[j];
                 subLen++;
                 if (sum >= target) { // 找到满足条件的子序列
                     resLen = Math.min(resLen, subLen);
                     break;
                 }
             }
         }

         return resLen == 999999 ? 0 : resLen;
    }


    /**
     * !滑动窗口
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     *
     * 所谓滑动窗口，就是不断的调节子序列的起始位置和终止位置，从而得出我们要想的结果。
     * 滑动窗口可以用一个for循环完成上述两个for循环的工作
     * 一个for循环来表示滑动窗口的终止位置
     * 也可以理解为是双指针的一种
     *
     * !此题要考虑三点
     * 窗口是满足>= target的连续子数组
     * 如果窗口的值大于target就要向前移动
     * 窗口结束位置就是遍历数组的结束位置
     *
     * 关键在于起始位置的移动， 也就是根据当前子序列大小情况调节滑动窗口的其起始位置
     *
     *  @param target 正整数
     *  @param nums 含有n个正整数的数组
     *  @return 子数组长度
     */
    public static int slidingWindowSubArrLen(int target, int[] nums) {
        // 滑动窗口长度
        int subLength = 0;
        // 最终选定长度
        int resLength = Integer.MAX_VALUE;
        // 起始位置
        int i = 0;
        // 滑动窗口数值和
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            // 注意这里使用while，每次更新 i（起始位置），并不断比较子序列是否符合条件
            // 第一次进入滑动窗口的时候满足>target，调整起始位置的时候可能又满足>= target，又是一个子序列
            while (sum >= target) {
                subLength = j - i + 1;
                resLength = Math.min(resLength, subLength);

                // 起始位置移动，对sum进行更改
                sum -= nums[i++];
            }
        }

        return resLength == Integer.MAX_VALUE ? 0 : resLength;
    }
}
