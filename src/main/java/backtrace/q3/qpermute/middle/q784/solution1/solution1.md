方法一：递归【通过】
思路

从左往右依次遍历字符，过程中保持 ans 为已遍历过字符的字母大小全排列。

例如，当 S = "abc" 时，考虑字母 "a", "b", "c"，初始令 ans = [""]，依次更新 ans = ["a", "A"]， ans = ["ab", "Ab", "aB", "AB"]， 
ans = ["abc", "Abc", "aBc", "ABc", "abC", "AbC", "aBC", "ABC"]。

算法

如果下一个字符 c 是字母，将当前已遍历过的字符串全排列复制两份，在第一份的每个字符串末尾添加 lowercase(c)，在第二份的每个字符串末尾添加 uppercase(c)。

如果下一个字符 c 是数字，将 c 直接添加到每个字符串的末尾。

JavaPython

class Solution {
public List<String> letterCasePermutation(String S) {
List<StringBuilder> ans = new ArrayList();
ans.add(new StringBuilder());

        for (char c: S.toCharArray()) {
            int n = ans.size();
            if (Character.isLetter(c)) {
                for (int i = 0; i < n; ++i) {
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n+i).append(Character.toUpperCase(c));
                }
            } else {
                for (int i = 0; i < n; ++i)
                    ans.get(i).append(c);
            }
        }

        List<String> finalans = new ArrayList();
        for (StringBuilder sb: ans)
            finalans.add(sb.toString());
        return finalans;
    }
}
复杂度分析

时间复杂度：O(2^{N} * N)，其中 N 是 S 的长度。

空间复杂度：O(2^N * N)