package com.djn.algorithm.array.binarysearch;

/**
 * !leetcode34.在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组nums，和一个目标值target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回[-1, -1]。
 *
 * !主要考虑情况
 * 寻找target在数组里的左右边界，有如下三种情况
 * 情况一：target 在数组范围的右边或者左边，例如数组{3, 4, 5}，target为2或者数组{3, 4, 5},target为6，此时应该返回{-1, -1}
 * 情况二：target 在数组范围中，且数组中不存在target，例如数组{3,6,7},target为5，此时应该返回{-1, -1}
 * 情况三：target 在数组范围中，且数组中存在target，例如数组{3,6,7},target为6，此时应该返回{1, 1}
 *
 * !方法
 * 也是使用二分查找,分别搜索左边界和右边界
 * 这里搜索的时候并不是找target值，而是寻找比target刚好大一点和小一点的值
 */
public class FindFirstLastPosition {
    /**
     * !二分搜索(闭区间)
     *
     * @param nums 有序数组
     * @param target 目标值
     * @return 找到边界返回左边界和右边界索引，找不到返回[-1, -1]
     */
    public static int[] binarySearchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);

        // 情况一
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[]{-1, -1};
        }

        // 情况三等正常情况
        if ((rightBorder - leftBorder) > 1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }

        // 情况二
        return new int[] {-1, -1};

    }



    /**
     * !搜索右边界
     *
     * @param nums 有序数组
     * @param target 目标值
     * @return 返回右边界的索引，如果不存在返回-2
     */
    public static int getRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        int rightBorder = -2; // 右边界结果

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            }else {// 等于target的时候继续向右搜索，才能得到右边界
                left = middle + 1;
                rightBorder = left; // 更新右边界
            }
        }

        return rightBorder;
    }

    /**
     * !搜索左边界
     *
     * @param nums 有序数组
     * @param target 目标值
     * @return 返回左边界的索引，如果不存在返回-2
     */
    public static int getLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        int leftBorder = -2; // 右边界结果

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            }else {// 等于target的时候继续向右搜索，才能得到右边界
                right = middle - 1;
                leftBorder = right; // 更新右边界
            }
        }

        return leftBorder;
    }

}
