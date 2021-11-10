方法二：二分掩码【通过】
思路

假设字符串 S 有 BB 个字母，那么全排列就有 2^B个字符串，且可以用位掩码 bits 唯一地表示。

例如，可以用 00 表示 a7b， 01 表示 a7B， 10 表示 A7b， 11 表示 A7B。注意数字不是掩码的一部分。

算法

根据位掩码，构造正确的全排列结果。如果下一个字符是字母，则根据位掩码添加小写或大写字母。 否则添加对应的数字。

JavaPython

class Solution {
public List<String> letterCasePermutation(String S) {
int B = 0;
for (char c: S.toCharArray())
if (Character.isLetter(c))
B++;

        List<String> ans = new ArrayList();

        for (int bits = 0; bits < 1<<B; bits++) {
            int b = 0;
            StringBuilder word = new StringBuilder();
            for (char letter: S.toCharArray()) {
                if (Character.isLetter(letter)) {
                    if (((bits >> b++) & 1) == 1)
                        word.append(Character.toLowerCase(letter));
                    else
                        word.append(Character.toUpperCase(letter));
                } else {
                    word.append(letter);
                }
            }

            ans.add(word.toString());
        }

        return ans;

    }
}
复杂度分析

时间和空间复杂度：O(2^{N} * N)，与方法一分析相同。
