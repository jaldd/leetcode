方法 2：动态编程

在暴力方法中，我们仅仅为了找到最大值每次都要向左和向右扫描一次。但是我们可以提前存储这个值。因此，可以通过动态编程解决。

这个概念可以见下图解释：
![img.png](img.png)

算法

找到数组中从下标 i 到最左端最高的条形块高度 left_max。
找到数组中从下标 i 到最右端最高的条形块高度 right_max。
扫描数组 height 并更新答案：
累加 min({max_left}[i],{max_right}[i]) - {height}[i] 到 ans 上
public int trap(int[] height) {
if (height == null || height.length == 0)
return 0;
int ans = 0;
int size = height.length;
int[] left_max = new int[size];
int[] right_max = new int[size];
left_max[0] = height[0];
for (int i = 1; i < size; i++) {
left_max[i] = Math.max(height[i], left_max[i - 1]);
}
right_max[size - 1] = height[size - 1];
for (int i = size - 2; i >= 0; i--) {
right_max[i] = Math.max(height[i], right_max[i + 1]);
}
for (int i = 1; i < size - 1; i++) {
ans += Math.min(left_max[i], right_max[i]) - height[i];
}
return ans;
}

复杂性分析

时间复杂度：O(n)。

存储最大高度数组，需要两次遍历，每次 O(n) 。
最终使用存储的数据更新ans ，O(n)。
空间复杂度：O(n) 额外空间。

和方法 1 相比使用了额外的 O(n) 空间用来放置left_max 和 right_max 数组。

