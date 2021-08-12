思路及算法

由于题目要求删除数组中等于 \textit{val}val 的元素，因此输出数组的长度一定小于等于输入数组的长度，我们可以把输出的数组直接写在输入数组上。可以使用双指针：右指针 \textit{right}right 指向当前将要处理的元素，左指针 \textit{left}left 指向下一个将要赋值的位置。

如果右指针指向的元素不等于 \textit{val}val，它一定是输出数组的一个元素，我们就将右指针指向的元素复制到左指针位置，然后将左右指针同时右移；

如果右指针指向的元素等于 \textit{val}val，它不能在输出数组里，此时左指针不动，右指针右移一位。

整个过程保持不变的性质是：区间 [0,\textit{left})[0,left) 中的元素都不等于 \textit{val}val。当左右指针遍历完输入数组以后，\textit{left}left 的值就是输出数组的长度。

这样的算法在最坏情况下（输入数组中没有元素等于 \textit{val}val），左右指针各遍历了数组一次。

代码

C++JavaJavaScriptGolangC

class Solution {
public int removeElement(int[] nums, int val) {
int n = nums.length;
int left = 0;
for (int right = 0; right < n; right++) {
if (nums[right] != val) {
nums[left] = nums[right];
left++;
}
}
return left;
}
}
复杂度分析

时间复杂度：O(n)O(n)，其中 nn 为序列的长度。我们只需要遍历该序列至多两次。

空间复杂度：O(1)O(1)。我们只需要常数的空间保存若干变量。

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/remove-element/solution/yi-chu-yuan-su-by-leetcode-solution-svxi/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。