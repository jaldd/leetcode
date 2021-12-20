我们实际上可以让代码写的更加简洁，只需要对比两个字符串对应位置上的字符，如果遇到不同的时候，这时看两个字符串的长度关系，如果相等，则比较当前位置后的字串是否相同，如果s的长度大，
那么比较s的下一个位置开始的子串，和t的当前位置开始的子串是否相同，反之如果t的长度大，则比较t的下一个位置开始的子串，和s的当前位置开始的子串是否相同。如果循环结束，都没有找到不同的字符，
那么此时看两个字符串的长度是否相差1，参见代码如下：

解法二：

复制代码
class Solution {
public:
bool isOneEditDistance(string s, string t) {
for (int i = 0; i < min(s.size(), t.size()); ++i) {
if (s[i] != t[i]) {
if (s.size() == t.size()) return s.substr(i + 1) == t.substr(i + 1);
if (s.size() < t.size()) return s.substr(i) == t.substr(i + 1);
else return s.substr(i + 1) == t.substr(i);
}
}
return abs((int)s.size() - (int)t.size()) == 1;
}
};
