方法一：枚举时分
由题意可知，小时由 4 个比特表示，分钟由 6 个比特表示，比特位值为 0 表示灯灭，为 1 表示灯亮。

我们可以枚举小时的所有可能值 [0,11]，以及分钟的所有可能值 [0,59]，并计算二者的二进制中 11 的个数之和，若为 turnedOn，则将其加入到答案中。

C++JavaC#GolangJavaScriptPython3C

class Solution {
public List<String> readBinaryWatch(int turnedOn) {
List<String> ans = new ArrayList<String>();
for (int h = 0; h < 12; ++h) {
for (int m = 0; m < 60; ++m) {
if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
ans.add(h + ":" + (m < 10 ? "0" : "") + m);
}
}
}
return ans;
}
}
复杂度分析

时间复杂度：O(1)。枚举的次数是一个与输入无关的定值。

空间复杂度：O(1)。仅使用了常数大小的空间。注意返回值不计入空间复杂度。
