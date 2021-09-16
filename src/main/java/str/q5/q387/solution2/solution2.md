思路与算法

我们可以对方法一进行修改，使得第二次遍历的对象从字符串变为哈希映射。

具体地，对于哈希映射中的每一个键值对，键表示一个字符，值表示它的首次出现的索引（如果该字符只出现一次）或者 -1（如果该字符出现多次）。当我们第一次遍历字符串时，设当前遍历到的字符为 c，如果 c 不在哈希映射中，我们就将 c 与它的索引作为一个键值对加入哈希映射中，否则我们将 c 在哈希映射中对应的值修改为 −1。

在第一次遍历结束后，我们只需要再遍历一次哈希映射中的所有值，找出其中不为 -1 的最小值，即为第一个不重复字符的索引。如果哈希映射中的所有值均为 -1，我们就返回 -1。

代码

C++JavaPython3JavaScriptGolangC

class Solution {
public int firstUniqChar(String s) {
Map<Character, Integer> position = new HashMap<Character, Integer>();
int n = s.length();
for (int i = 0; i < n; ++i) {
char ch = s.charAt(i);
if (position.containsKey(ch)) {
position.put(ch, -1);
} else {
position.put(ch, i);
}
}
int first = n;
for (Map.Entry<Character, Integer> entry : position.entrySet()) {
int pos = entry.getValue();
if (pos != -1 && pos < first) {
first = pos;
}
}
if (first == n) {
first = -1;
}
return first;
}
}
复杂度分析

时间复杂度：O(n)，其中 n 是字符串 s 的长度。第一次遍历字符串的时间复杂度为 O(n)，第二次遍历哈希映射的时间复杂度为 O(∣Σ∣)，由于 s 包含的字符种类数一定小于 s 的长度，因此 O(∣Σ∣) 在渐进意义下小于 O(n)，可以忽略。

空间复杂度：O(∣Σ∣)，其中 Σ 是字符集，在本题中 s 只包含小写字母，因此 ∣Σ∣≤26。我们需要 O(∣Σ∣) 的空间存储哈希映射。