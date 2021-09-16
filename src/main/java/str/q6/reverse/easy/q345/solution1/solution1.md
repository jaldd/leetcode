方法一：双指针
思路与算法

我们可以使用两个指针 i 和 j 对字符串相向地进行遍历。

具体地，指针 i 初始时指向字符串 s 的首位，指针 j 初始时指向字符串 s 的末位。在遍历的过程中，我们不停地将 i 向右移动，直到 i 指向一个元音字母（或者超出字符串的边界范围）；
同时，我们不停地将 j 向左移动，直到 j 指向一个元音字母。此时，如果 i<j，那么我们交换 i 和 j 指向的元音字母，否则说明所有的元音字母均已遍历过，就可以退出遍历的过程。

代码

C++JavaC#Python3JavaScriptGolangC

class Solution {
public String reverseVowels(String s) {
int n = s.length();
char[] arr = s.toCharArray();
int i = 0, j = n - 1;
while (i < j) {
while (i < n && !isVowel(arr[i])) {
++i;
}
while (j > 0 && !isVowel(arr[j])) {
--j;
}
if (i < j) {
swap(arr, i, j);
++i;
--j;
}
}
return new String(arr);
}

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
复杂度分析

时间复杂度：O(n)，其中 n 是字符串 s 的长度。在最坏的情况下，两个指针各遍历整个字符串一次。

空间复杂度：O(1) 或 O(n)，取决于使用的语言中字符串类型的性质。如果字符串是可修改的，那么我们可以直接在字符串上使用双指针进行交换，空间复杂度为 O(1)，否则需要使用 O(n) 的空间将字符串临时转换为可以修改的数据结构（例如数组），空间复杂度为 O(n)。
