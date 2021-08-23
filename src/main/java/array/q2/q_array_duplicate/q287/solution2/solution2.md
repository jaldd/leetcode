方法二：二进制
思路和算法

这个方法我们来将所有数二进制展开按位考虑如何找出重复的数，如果我们能确定重复数每一位是 11 还是 00 就可以按位还原出重复的数是什么。

考虑到第 ii 位，我们记 \textit{nums}nums 数组中二进制展开后第 ii 位为 11 的数有 xx 个，数字 [1,n][1,n] 这 nn 个数二进制展开后第 ii 位为 11 的数有 yy 个，那么重复的数第 ii 位为 11 当且仅当 x>yx>y。

仍然以示例 1 为例，如下的表格列出了每个数字二进制下每一位是 11 还是 00 以及对应位的 xx 和 yy 是多少：

1	3	4	2	2	x	y
第 0 位	1	1	0	0	0	2	2
第 1 位	0	1	0	1	1	3	2
第 2 位	0	0	1	0	0	1	1
那么按之前说的我们发现只有第 11 位 x>yx>y ，所以按位还原后 \textit{target}=(010)_2=(2)_{10}target=(010)
2
​
=(2)
10
​
，符合答案。

正确性的证明其实和方法一类似，我们可以按方法一的方法，考虑不同示例数组中第 ii 位 11 的个数 xx 的变化：

如果测试用例的数组中 \textit{target}target 出现了两次，其余的数各出现了一次，且 \textit{target}target 的第 ii 位为 11，那么 \textit{nums}nums 数组中第 ii 位 11 的个数 xx 恰好比 yy 大一。如果\textit{target}target 的第 ii 位为 00，那么两者相等。
如果测试用例的数组中 \textit{target}target 出现了三次及以上，那么必然有一些数不在 \textit{nums}nums 数组中了，这个时候相当于我们用 \textit{target}target 去替换了这些数，我们考虑替换的时候对 xx 的影响：
如果被替换的数第 ii 位为 11，且 \textit{target}target 第 ii 位为 11：xx 不变，满足 x>yx>y。
如果被替换的数第 ii 位为 00，且 \textit{target}target 第 ii 位为 11：xx 加一，满足 x>yx>y。
如果被替换的数第 ii 位为 11，且 \textit{target}target 第 ii 位为 00：xx 减一，满足 x\le yx≤y。
如果被替换的数第 ii 位为 00，且 \textit{target}target 第 ii 位为 00：xx 不变，满足 x\le yx≤y。
也就是说如果 \textit{target}target 第 ii 位为 11，那么每次替换后只会使 xx 不变或增大，如果为 00，只会使 xx 不变或减小，始终满足 x>yx>y 时 \textit{target}target 第 ii 位为 11，否则为 00，因此我们只要按位还原这个重复的数即可。

C++JavaScriptJavaGolang

class Solution {
public int findDuplicate(int[] nums) {
int n = nums.length, ans = 0;
int bit_max = 31;
while (((n - 1) >> bit_max) == 0) {
bit_max -= 1;
}
for (int bit = 0; bit <= bit_max; ++bit) {
int x = 0, y = 0;
for (int i = 0; i < n; ++i) {
if ((nums[i] & (1 << bit)) != 0) {
x += 1;
}
if (i >= 1 && ((i & (1 << bit)) != 0)) {
y += 1;
}
}
if (x > y) {
ans |= 1 << bit;
}
}
return ans;
}
}
复杂度证明

时间复杂度：O(n\log n)O(nlogn)，其中 nn 为 \textit{nums}nums 数组的长度。O(\log n)O(logn) 代表了我们枚举二进制数的位数个数，枚举第 ii 位的时候需要遍历数组统计 xx 和 yy 的答案，因此总时间复杂度为 O(n\log n)O(nlogn)。

空间复杂度：O(1)O(1)。我们只需要常数空间存放若干变量。
