朴素解法（TLE）
一个朴素的做法根据「扰乱字符串」的生成规则进行判断。

由于题目说了整个生成「扰乱字符串」的过程是通过「递归」来进行。

我们要实现 isScramble 函数的作用是判断 s1 是否可以生成出 s2。

这样判断的过程，同样我们可以使用「递归」来做：

假设 s1 的长度为 n， 的第一次分割的分割点为 i，那么 s1s1 会被分成 [0, i) 和 [i, n) 两部分。

同时由于生成「扰乱字符串」时，可以选交换也可以选不交换。因此我们的 s2 会有两种可能性：



因为对于某个确定的分割点，s1s1 固定分为两部分，分别为 [0,i) & [i, n)。

而 s2 可能会有两种分割方式，分别 [0,i) & [i,n) 和 [0, n-i) & [n-i,n)。

我们只需要递归调用 isScramble 检查 s1 的 [0,i) & [i, n) 部分能否与 「s2 的 [0,i) & [i,n)」 或者 「s2 的 [0, n-i) & [n-i,n)」 匹配即可。

同时，我们将「s1 和 s2 相等」和「s1 和 s2 词频不同」作为「递归」出口。

理解这套做法十分重要，后续的解法都是基于此解法演变过来。

代码：

java

class Solution {
public boolean isScramble(String s1, String s2) {
if (s1.equals(s2)) return true;
if (!check(s1, s2)) return false;
int n = s1.length();
for (int i = 1; i < n; i++) {
// s1 的 [0,i) 和 [i,n)
String a = s1.substring(0, i), b = s1.substring(i);
// s2 的 [0,i) 和 [i,n)
String c = s2.substring(0, i), d = s2.substring(i);
if (isScramble(a, c) && isScramble(b, d)) return true;
// s2 的 [0,n-i) 和 [n-i,n)
String e = s2.substring(0, n - i), f = s2.substring(n - i);
if (isScramble(a, f) && isScramble(b, e)) return true;
}
return false;
}
// 检查 s1 和 s2 词频是否相同
boolean check(String s1, String s2) {
if (s1.length() != s2.length()) return false;
int n = s1.length();
int[] cnt1 = new int[26], cnt2 = new int[26];
char[] cs1 = s1.toCharArray(), cs2 = s2.toCharArray();
for (int i = 0; i < n; i++) {
cnt1[cs1[i] - 'a']++;
cnt2[cs2[i] - 'a']++;
}
for (int i = 0; i < 26; i++) {
if (cnt1[i] != cnt2[i]) return false;
}
return true;
}
}
时间复杂度：O(5^n)
空间复杂度：忽略递归与生成子串带来的空间开销，复杂度为 O(1)



记忆化搜索
朴素解法卡在了 286/288 个样例。

我们考虑在朴素解法的基础上，增加「记忆化搜索」功能。

我们可以重新设计我们的「爆搜」逻辑：假设 s1 从 i 位置开始，s2 从 jj 位置开始，后面的长度为 len 的字符串是否能形成「扰乱字符串」（互为翻转）。

那么在单次处理中，我们可分割的点的范围为 [1,len)，然后和「递归」一下，将 s1 分割出来的部分尝试去和 s2 的对应位置匹配。

同样的，我们将「入参对应的子串相等」和「入参对应的子串词频不同」作为「递归」出口。


javac++

class Solution {
String s1; String s2;
int n;
int[][][] cache;
int N = -1, Y = 1, EMPTY = 0;
public boolean isScramble(String _s1, String _s2) {
s1 = _s1; s2 = _s2;
if (s1.equals(s2)) return true;
if (s1.length() != s2.length()) return false;
n = s1.length();
// cache 的默认值是 EMPTY
cache = new int[n][n][n + 1];
return dfs(0, 0, n);
}
boolean dfs(int i, int j, int len) {
if (cache[i][j][len] != EMPTY) return cache[i][j][len] == Y;
String a = s1.substring(i, i + len), b = s2.substring(j, j + len);
if (a.equals(b)) {
cache[i][j][len] = Y;
return true;
}
if (!check(a, b)) {
cache[i][j][len] = N;
return false;
}
for (int k = 1; k < len; k++) {
// 对应了「s1 的 [0,i) & [i,n)」匹配「s2 的 [0,i) & [i,n)」
if (dfs(i, j, k) && dfs(i + k, j + k, len - k)) {
cache[i][j][len] = Y;
return true;
}
// 对应了「s1 的 [0,i) & [i,n)」匹配「s2 的 [n-i,n) & [0,n-i)」
if (dfs(i, j + len - k, k) && dfs(i + k, j, len - k)) {
cache[i][j][len] = Y;
return true;
}
}
cache[i][j][len] = N;
return false;
}
// 检查 s1 和 s2 词频是否相同
boolean check(String s1, String s2) {
if (s1.length() != s2.length()) return false;
int n = s1.length();
int[] cnt1 = new int[26], cnt2 = new int[26];
char[] cs1 = s1.toCharArray(), cs2 = s2.toCharArray();
for (int i = 0; i < n; i++) {
cnt1[cs1[i] - 'a']++;
cnt2[cs2[i] - 'a']++;
}
for (int i = 0; i < 26; i++) {
if (cnt1[i] != cnt2[i]) return false;
}
return true;
}
}
时间复杂度：O(n^4)
空间复杂度：O(n^3)





动态规划（区间 DP）
其实有了上述「记忆化搜索」方案之后，我们就已经可以直接忽略原问题，将其改成「动态规划」了。

根据「dfs 方法的几个可变入参」作为「状态定义的几个维度」，根据「dfs 方法的返回值」作为「具体的状态值」。

我们可以得到状态定义 f[i][j][len]：

f[i][j][len] 代表 s1 从 i 开始，s2 从 j 开始，后面长度为 len 的字符是否能形成「扰乱字符串」（互为翻转）。

状态转移方程其实就是翻译我们「记忆化搜索」中的 dfs 主要逻辑部分：


    // 对应了「s1 的 [0,i) & [i,n)」匹配「s2 的 [0,i) & [i,n)」
    if (dfs(i, j, k) && dfs(i + k, j + k, len - k)) {
        cache[i][j][len] = Y;
        return true;
    }
    // 对应了「s1 的 [0,i) & [i,n)」匹配「s2 的 [n-i,n) & [0,n-i)」
    if (dfs(i, j + len - k, k) && dfs(i + k, j, len - k)) {
        cache[i][j][len] = Y;
        return true;
    }
从状态定义上，我们就不难发现这是一个「区间 DP」问题，区间长度大的状态值可以由区间长度小的状态值递推而来。

而且由于本身我们在「记忆化搜索」里面就是从小到大枚举 len，因此这里也需要先将 len 这层循环提前，确保我们转移 f[i][j][len] 时所需要的状态都已经被计算好。




javac++

时间复杂度：O(n^4)
空间复杂度：O(n^3)
