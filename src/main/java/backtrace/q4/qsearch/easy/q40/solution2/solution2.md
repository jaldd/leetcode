方法二：二进制枚举
另一种枚举方法是枚举所有 2^{10}=1024 种灯的开闭组合，即用一个二进制数表示灯的开闭，其高 4 位为小时，低 6 位为分钟。若小时和分钟的值均在合法范围内，
且二进制中 1 的个数为 turnedOn，则将其加入到答案中。

C++JavaC#GolangJavaScriptPython3C

class Solution {
public:
vector<string> readBinaryWatch(int turnedOn) {
vector<string> ans;
for (int i = 0; i < 1024; ++i) {
int h = i >> 6, m = i & 63; // 用位运算取出高 4 位和低 6 位
if (h < 12 && m < 60 && __builtin_popcount(i) == turnedOn) {
ans.push_back(to_string(h) + ":" + (m < 10 ? "0" : "") + to_string(m));
}
}
return ans;
}
};
复杂度分析

时间复杂度：O(1)。枚举的次数是一个与输入无关的定值。

空间复杂度：O(1)。仅使用了常数大小的空间。注意返回值不计入空间复杂度。

本题还有利用位运算，枚举恰好有 turnedOn 个 1 的二进制数的方法，但超出了这篇题解的范围，有兴趣的读者可自行查阅相关资料。
