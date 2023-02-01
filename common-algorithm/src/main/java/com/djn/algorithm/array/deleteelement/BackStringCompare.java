package com.djn.algorithm.array.deleteelement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * !leetcode844.比较含退格的字符串
 * 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * !主要考虑情况:
 * 1. 正常情况，遇到#就删除前面的一个字符
 * 2. 如果遇到#时, 前面已经没有字符可以删除，文本继续为空，也就是忽略删除
 *
 * !方法:
 * 1. 使用栈这种数据结构
 * 遇到正常字符就推入栈，遇到#就从顶部推出栈
 * 最后直接从栈底到栈顶对比元素即可
 *
 */
public class BackStringCompare {
    /**
     * !使用栈解决
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param s 需要进行对比的第一个字符串
     * @param t 需要进行对比的第二个字符串
     * @return 进行退格处理后，两个字符串是否相等
     */
    public static boolean backspaceCompare(String s, String t) {
        return Arrays.equals(build(s), build(t));
    }

    private static Object[] build(String str) {
        Deque<Character> newStr = new ArrayDeque<>();

        for (int p = 0; p < str.length(); p++) {
            if (str.charAt(p) == '#') {
                if (newStr.size() > 0) {
                    newStr.pop();
                }
            }else {
                newStr.push(str.charAt(p));
            }
        }

        return newStr.toArray();
    }
}
