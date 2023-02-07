package com.djn.algorithm.array.spiralmatrix;

/**
 * !leetcode59.螺旋矩阵Ⅱ
 * !面试中出现频率比较高
 *
 * 给你一个正整数n，生成一个包含1到n^2所有元素且元素按顺时针顺序螺旋排列的n x n正方形矩阵matrix
 *
 * 具体思路详见
 * <a href="https://www.programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html#%E6%80%9D%E8%B7%AF">...</a>
 */
public class SprialMatrixSec {
    /**
     * !左闭右开原则
     *
     * 1.遵循循环不变量原则
     * 2.先考虑转几圈
     * 3.奇数最后会剩下一个位置
     * 4.起始位置(i, j)每一圈都会改变的
     * 5.注意循环的终止位置
     *
     * @param n 正整数n, 用于生成一个包含1到n^2所有元素的顺时针螺旋矩阵
     * @return 螺旋矩阵
     */
    public static int[][] generateMatrix(int n) {
        // 循环的起始位置, 每一圈进行改变
        int startX = 0;
        int startY = 0;
        // 控制内循环终止位置，遵循左闭右开原则
        int offset = 1;
        // 初始化n*n的矩阵
        int[][] resMatrix = new int[n][n];
        // 矩阵填充的数字, 从1开始
        int num = 1;
        // 转圈赋值时候的二维坐标指针(i, j)
        int i = 0;
        int j = 0;
        // 转几圈
        int loop = n / 2;


        while (loop-- > 0) {
            // 顺时针第一条边
            for (j = startY; j < n - offset; j++) {
                resMatrix[startX][j] = num++;
            }

            // 第二条边
            for (i = startX; i < n - offset; i++) {
                resMatrix[i][j] = num++;
            }

            // 第三条边
            for (; j > startY; j--) {
                resMatrix[i][j] = num++;
            }

            // 第四条边
            for (; i > startX; i--) {
                resMatrix[i][j] = num++;
            }

            // 更新起始位置坐标
            startX++;
            startY++;

            // 更新offset，让下一个循环也满足左闭右开
            offset++;
        }

        // n是奇数，就将中心位置单独填充
        if (n % 2 == 1) {
            resMatrix[startX][startY] = num;
        }


        return resMatrix;
    }
}
