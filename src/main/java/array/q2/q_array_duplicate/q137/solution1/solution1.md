方法一：哈希表
思路与算法

我们可以使用哈希映射统计数组中每个元素的出现次数。对于哈希映射中的每个键值对，键表示一个元素，值表示其出现的次数。

在统计完成后，我们遍历哈希映射即可找出只出现一次的元素。

代码

C++JavaPython3JavaScriptGolangC

class Solution {
public int singleNumber(int[] nums) {
Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
for (int num : nums) {
freq.put(num, freq.getOrDefault(num, 0) + 1);
}
int ans = 0;
for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
int num = entry.getKey(), occ = entry.getValue();
if (occ == 1) {
ans = num;
break;
}
}
return ans;
}
}
复杂度分析

时间复杂度：O(n)，其中 nn 是数组的长度。

空间复杂度：O(n)。哈希映射中包含最多 \lfloor n/3 \rfloor + 1⌊n/3⌋+1 个元素，即需要的空间为 O(n)O(n)。
