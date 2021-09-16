方法一：暴力匹配
思路及算法

我们可以让字符串 needle 与字符串 haystack 的所有长度为 m 的子串均匹配一次。

为了减少不必要的匹配，我们每次匹配失败即立刻停止当前子串的匹配，对下一个子串继续匹配。如果当前子串匹配成功，我们返回当前子串的开始位置即可。如果所有子串都匹配失败，则返回 -1。

代码

C++JavaJavaScriptGolangC

class Solution {
public int strStr(String haystack, String needle) {
int n = haystack.length(), m = needle.length();
for (int i = 0; i + m <= n; i++) {
boolean flag = true;
for (int j = 0; j < m; j++) {
if (haystack.charAt(i + j) != needle.charAt(j)) {
flag = false;
break;
}
}
if (flag) {
return i;
}
}
return -1;
}
}
复杂度分析

时间复杂度：O(n×m)，其中 n 是字符串 haystack 的长度，m 是字符串 needle 的长度。最坏情况下我们需要将字符串 needle 与字符串 haystack 的所有长度为 m 的子串均匹配一次。

空间复杂度：O(1)。我们只需要常数的空间保存若干变量。
