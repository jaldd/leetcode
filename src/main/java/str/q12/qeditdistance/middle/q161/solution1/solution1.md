判断两个字符串的编辑距离是否为1，那么只需分下列三种情况来考虑就行了：

1. 两个字符串的长度之差大于1，直接返回False。

2. 两个字符串的长度之差等于1，长的那个字符串去掉一个字符，剩下的应该和短的字符串相同。

3. 两个字符串的长度之差等于0，两个字符串对应位置的字符只能有一处不同。

分析清楚了所有的情况，代码就很好写了，参见如下：



解法一：

复制代码
class Solution {
public:
bool isOneEditDistance(string s, string t) {
if (s.size() < t.size()) swap(s, t);
int m = s.size(), n = t.size(), diff = m - n;
if (diff >= 2) return false;
else if (diff == 1) {
for (int i = 0; i < n; ++i) {
if (s[i] != t[i]) {
return s.substr(i + 1) == t.substr(i);
}
}
return true;
} else {
int cnt = 0;
for (int i = 0; i < m; ++i) {
if (s[i] != t[i]) ++cnt;
}
return cnt == 1;
}
}
};