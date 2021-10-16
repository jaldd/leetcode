方法二：按行访问
思路

按照与逐行读取 Z 字形图案相同的顺序访问字符串。

算法

首先访问 行 0 中的所有字符，接着访问 行 1，然后 行 2，依此类推...

对于所有整数 k，

行 0 中的字符位于索引 k(2⋅numRows−2) 处;
行 numRows−1 中的字符位于索引 k(2⋅numRows−2)+numRows−1 处;
内部的 行 i 中的字符位于索引 k(2⋅numRows−2)+i 以及 (k+1)(2⋅numRows−2)−i 处;

C++Java

class Solution {
public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}
复杂度分析

时间复杂度：O(n)，其中 n==len(s)。每个索引被访问一次。
空间复杂度：O(n)。对于 C++ 实现，如果返回字符串不被视为额外空间，则复杂度为 O(1)。
