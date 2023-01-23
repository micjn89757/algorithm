# Java版本的数据结构与算法(leetcode)
## common-algorithm
常用算法，面试算法
目前主要是根据代码随想录学习,然后加上自己补充
### 数组有关算法
#### 二分搜索 BinarySearch
两种实现:
- 闭区间[left, right]
- 开区间[left, right)
leetcode相关题目：
- 34,35,69,367, 704
注意事项：
- left + (right - left) / 2 和 (left + right) / 2 结果是一样的，主要是为了防止结果超出int型能表示的范围 

#### 移除数组元素
- leetcode相关题目
- 27