思路

如果要移除的元素恰好在数组的开头，例如序列 [1,2,3,4,5][1,2,3,4,5]，当 \textit{val}val 为 11 时，我们需要把每一个元素都左移一位。注意到题目中说：「元素的顺序可以改变」。实际上我们可以直接将最后一个元素 55 移动到序列开头，取代元素 11，得到序列 [5,2,3,4][5,2,3,4]，同样满足题目要求。这个优化在序列中 \textit{val}val 元素的数量较少时非常有效。

实现方面，我们依然使用双指针，两个指针初始时分别位于数组的首尾，向中间移动遍历该序列。

算法

如果左指针 \textit{left}left 指向的元素等于 \textit{val}val，此时将右指针 \textit{right}right 指向的元素复制到左指针 \textit{left}left 的位置，然后右指针 \textit{right}right 左移一位。如果赋值过来的元素恰好也等于 \textit{val}val，可以继续把右指针 \textit{right}right 指向的元素的值赋值过来（左指针 \textit{left}left 指向的等于 \textit{val}val 的元素的位置继续被覆盖），直到左指针指向的元素的值不等于 \textit{val}val 为止。

当左指针 \textit{left}left 和右指针 \textit{right}right 重合的时候，左右指针遍历完数组中所有的元素。

这样的方法两个指针在最坏的情况下合起来只遍历了数组一次。与方法一不同的是，方法二避免了需要保留的元素的重复赋值操作。

代码

C++JavaJavaScriptGolangC

class Solution {
public int removeElement(int[] nums, int val) {
int left = 0;
int right = nums.length;
while (left < right) {
if (nums[left] == val) {
nums[left] = nums[right - 1];
right--;
} else {
left++;
}
}
return left;
}
}
复杂度分析

时间复杂度：O(n)O(n)，其中 nn 为序列的长度。我们只需要遍历该序列至多一次。

空间复杂度：O(1)O(1)。我们只需要常数的空间保存若干变量。

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/remove-element/solution/yi-chu-yuan-su-by-leetcode-solution-svxi/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。