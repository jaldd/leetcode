方法 4：使用双指针
直观想法

和方法 2 相比，我们不从左和从右分开计算，我们想办法一次完成遍历。
从动态编程方法的示意图中我们注意到，只要 right_max[i]>left_max[i] （元素 0 到元素 6），积水高度将由 left_max 决定，类似地 left_max[i]>right_max[i]（元素 8 到元素 11）。
所以我们可以认为如果一端有更高的条形块（例如右端），积水的高度依赖于当前方向的高度（从左到右）。当我们发现另一侧（右侧）的条形块高度不是最高的，我们则开始从相反的方向遍历（从右到左）。
我们必须在遍历时维护 left_max 和 right_max ，但是我们现在可以使用两个指针交替进行，实现 1 次遍历即可完成。

算法

初始化 left 指针为 0 并且 right 指针为 size-1
While left<right, do:
If height[left] < height[right]
If height[left]≥left_max, 更新 left_max
Else 累加 left_max−height[left] 到 ans
left = left + 1.
Else
If height[right]≥right_max, 更新 right_max
Else 累加 right_max−height[right] 到 ans
right = right - 1.

复杂性分析

时间复杂度：O(n)。单次遍历的时间O(n)。
空间复杂度：O(1) 的额外空间。left, right, left_max 和 right_max 只需要常数的空间。
