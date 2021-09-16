方法一：使用哈希表存储频数
思路与算法

我们可以对字符串进行两次遍历。

在第一次遍历时，我们使用哈希映射统计出字符串中每个字符出现的次数。在第二次遍历时，我们只要遍历到了一个只出现一次的字符，那么就返回它的索引，否则在遍历结束后返回 -1。

代码

C++JavaPython3JavaScriptGolangC

class Solution {
public int firstUniqChar(String s) {
Map<Character, Integer> frequency = new HashMap<Character, Integer>();
for (int i = 0; i < s.length(); ++i) {
char ch = s.charAt(i);
frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
}
for (int i = 0; i < s.length(); ++i) {
if (frequency.get(s.charAt(i)) == 1) {
return i;
}
}
return -1;
}
}
复杂度分析

时间复杂度：O(n)，其中 nn 是字符串 ss 的长度。我们需要进行两次遍历。

空间复杂度：O(∣Σ∣)，其中 Σ 是字符集，在本题中 ss 只包含小写字母，因此 ∣Σ∣≤26。我们需要 O(∣Σ∣) 的空间存储哈希映射。
