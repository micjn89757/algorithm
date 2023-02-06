package com.djn.algorithm.array.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * !leetcode904.水果成篮
 * 你正在探访一家农场，农场从左到右种植了一排果树。这些树用一个整数数组 fruits 表示，其中 fruits[i] 是第 i 棵树上的水果 种类 。
 *
 * 你想要尽可能多地收集水果。然而，农场的主人设定了一些严格的规矩，你必须按照要求采摘水果：
 *
 * -你只有两个篮子，并且每个篮子只能装单一类型的水果。每个篮子能够装的水果总量没有限制。
 * -你可以选择任意一棵树开始采摘，你必须从每棵树(包括开始采摘的)树上恰好摘一个水果。采摘的水果应当符合篮子中的水果类型。每采摘一次，你将会向右移动到下一棵树，并继续采摘。
 * -一旦你走到某棵树前，但水果不符合篮子的水果类型，那么就必须停止采摘。
 *
 * 给你一个整数数组fruits，返回你可以收集的水果的最大数目。
 *
 * 简单理解就是滑动窗口里面的不同数字最多有两种，求最长的子序列
 *
 * !思路
 * 滑动窗口
 *
 */
public class FruitIntoBaskets {

    /**
     * !滑动窗口
     * left和right分别表示满足要求的窗口的左右边界，同时我们使用哈希表存储这个窗口内的数以及出现的次数。
     *
     * 我们每次将right移动一个位置，并将fruits[right]加入哈希表。如果此时哈希表不满足要求（即哈希表中出现超过两个键值对），那么我们需要不断移动left，并将fruits[left]从哈希表中移除，直到哈希表满足要求为止。
     *
     * 需要注意的是，将fruits[left]从哈希表中移除后，如果fruits[left]在哈希表中的出现次数减少为0，需要将对应的键值对从哈希表中移除。
     *
     * @param fruits
     * @return
     */
    public static int totalFruit(int[] fruits) {
        int len = fruits.length;
        /*
            cnt是count的缩写
            key 表示fruit[i], value表示其在窗口中出现的次数
        */
        Map<Integer, Integer> cnt = new HashMap<>();
        int left = 0; // 滑动窗口起始位置
        int res = 0; // 最终结果

        for (int right = 0; right < len; right++) {
            // 加入新的种类，或者增加已有水果的个数
            cnt.put(fruits[right], cnt.getOrDefault(fruits[right], 0) + 1);
            // 不断移动left，并将fruits[left]从哈希表中移除, 直到满足最大种类为2
            while (cnt.size() > 2) {
                cnt.put(fruits[left], cnt.get(fruits[left]) - 1);
                // 移动起始位置的过程中如果某一种类数量递减为0，就删除此种类, 保证cnt里至多只有两种类别
                if (cnt.get(fruits[left]) == 0) {
                    cnt.remove(fruits[left]);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;

    }
}
