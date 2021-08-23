方法一：二分查找
思路和算法

我们定义 \textit{cnt}[i]cnt[i] 表示 \textit{nums}nums 数组中小于等于 ii 的数有多少个，假设我们重复的数是 \textit{target}target，那么 [1,\textit{target}-1][1,target−1]里的所有数满足 \textit{cnt}[i]\le icnt[i]≤i，[target,n][target,n] 里的所有数满足 \textit{cnt}[i]>icnt[i]>i，具有单调性。

以示例 1 为例，我们列出每个数字的 \textit{cnt}cnt 值：

nums	1	2	3	4
cnt	1	3	4	5
示例中重复的整数是 22，我们可以看到 [1,1][1,1] 中的数满足 \textit{cnt}[i]\le icnt[i]≤i，[2,4][2,4] 中的数满足 \textit{cnt}[i]>icnt[i]>i 。

如果知道 \textit{cnt}[]cnt[] 数组随数字 ii 逐渐增大具有单调性（即 \textit{target}target 前 \textit{cnt}[i]\le icnt[i]≤i，\textit{target}target 后 \textit{cnt}[i]>icnt[i]>i），那么我们就可以直接利用二分查找来找到重复的数。

但这个性质一定是正确的吗？考虑 \textit{nums}nums 数组一共有 n+1n+1 个位置，我们填入的数字都在 [1,n][1,n] 间，有且只有一个数重复放了两次以上。对于所有测试用例，考虑以下两种情况：

如果测试用例的数组中 \textit{target}target 出现了两次，其余的数各出现了一次，这个时候肯定满足上文提及的性质，因为小于 \textit{target}target 的数 ii 满足 \textit{cnt}[i]=icnt[i]=i，大于等于 \textit{target}target 的数 jj 满足 cnt[j]=j+1cnt[j]=j+1。

如果测试用例的数组中 \textit{target}target 出现了三次及以上，那么必然有一些数不在 \textit{nums}nums 数组中了，这个时候相当于我们用 \textit{target}target 去替换了这些数，我们考虑替换的时候对 \textit{cnt}[]cnt[] 数组的影响。如果替换的数 ii 小于 \textit{target}target ，那么 [i, \textit{target}-1][i,target−1] 的 \textit{cnt}cnt 值均减一，其他不变，满足条件。如果替换的数 jj 大于等于 \textit{target}target，那么 [\textit{target}, j-1][target,j−1] 的 \textit{cnt}cnt 值均加一，其他不变，亦满足条件。

因此我们生成的数组一定具有上述性质的。

C++JavaScriptJavaGolang

class Solution {
public int findDuplicate(int[] nums) {
int n = nums.length;
int l = 1, r = n - 1, ans = -1;
while (l <= r) {
int mid = (l + r) >> 1;
int cnt = 0;
for (int i = 0; i < n; ++i) {
if (nums[i] <= mid) {
cnt++;
}
}
if (cnt <= mid) {
l = mid + 1;
} else {
r = mid - 1;
ans = mid;
}
}
return ans;
}
}
复杂度分析

时间复杂度：O(n\log n)O(nlogn)，其中 nn 为 \textit{nums}nums 数组的长度。二分查找最多需要二分 O(\log n)O(logn) 次，每次判断的时候需要O(n)O(n) 遍历 \textit{nums}nums 数组求解小于等于 \textit{mid}mid 的数的个数，因此总时间复杂度为 O(n\log n)O(nlogn)。
空间复杂度：O(1)O(1)。我们只需要常数空间存放若干变量。
