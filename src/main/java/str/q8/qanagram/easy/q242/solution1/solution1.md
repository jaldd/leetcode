方法一：排序
t 是 s 的异位词等价于「两个字符串排序后相等」。因此我们可以对字符串 s 和 t 分别排序，看排序后的字符串是否相等即可判断。此外，如果 s 和 t 的长度不同，t 必然不是 s 的异位词。

JavaJavaScriptC++GolangC

class Solution {
public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
return false;
}
char[] str1 = s.toCharArray();
char[] str2 = t.toCharArray();
Arrays.sort(str1);
Arrays.sort(str2);
return Arrays.equals(str1, str2);
}
}
复杂度分析

时间复杂度：O(nlogn)，其中 nn 为 ss 的长度。排序的时间复杂度为 O(nlogn)，比较两个字符串是否相等时间复杂度为 O(n)，因此总体时间复杂度为 O(nlogn+n)=O(nlogn)。

空间复杂度：O(logn)。排序需要 O(logn) 的空间复杂度。注意，在某些语言（比如 Java & JavaScript）中字符串是不可变的，因此我们需要额外的 O(n) 的空间来拷贝字符串。但是我们忽略这一复杂度分析，因为：

这依赖于语言的细节；
这取决于函数的设计方式，例如，可以将函数参数类型更改为 char[]。