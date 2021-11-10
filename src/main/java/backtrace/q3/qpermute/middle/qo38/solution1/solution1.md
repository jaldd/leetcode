方法一：回溯
思路及解法

我们将这个问题看作有 n 个排列成一行的空位，我们需要从左往右依次填入题目给定的 n 个字符，每个字符只能使用一次。首先可以想到穷举的算法，即从左往右每一个空位都依次尝试填入一个字符，
看是否能填完这 n 个空位，编程实现时，我们可以用「回溯法」来模拟这个过程。

定义递归函数 backtrack(i,perm) 表示当前排列为 perm，下一个待填入的空位是第 ii 个空位（下标从 00 开始）。那么该递归函数分为两个情况：

如果 i=n，说明我们已经填完了 n 个空位，找到了一个可行的解，我们将 perm 放入答案数组中，递归结束。

如果 i<n，此时需要考虑第 ii 个空位填哪个字符。根据题目要求我们肯定不能填已经填过的字符，因此很容易想到的一个处理手段是我们定义一个标记数组 vis 来标记已经填过的字符，
那么在填第 i 个字符的时候我们遍历题目给定的 n 个字符，如果这个字符没有被标记过，我们就尝试填入，并将其标记，继续尝试填下一个空位，即调用函数 backtrack(i+1,perm)。
回溯时，我们需要要撤销该空位填的字符以及对该字符的标记，并继续向当前空位尝试填入其他没被标记过的字符。

但是该递归函数并没有满足「全排列不重复」的要求，在重复的字符较多的情况下，该递归函数会生成大量重复的排列。对于任意一个空位，如果存在重复的字符，
该递归函数会将它们重复填上去并继续尝试导致最后答案的重复。

解决该问题的一种较为直观的思路是，我们首先生成所有的排列，然后进行去重。而另一种思路是我们通过修改递归函数，使得该递归函数只会生成不重复的序列。

具体地，我们只要在递归函数中设定一个规则，保证在填每一个空位的时候重复字符只会被填入一次。具体地，我们首先对原字符串排序，保证相同的字符都相邻，在递归函数中，
我们限制每次填入的字符一定是这个字符所在重复字符集合中「从左往右第一个未被填入的字符」，即如下的判断条件：

C++

if (vis[j] || (j > 0 && !vis[j - 1] && s[j - 1] == s[j])) {
continue;
}
这个限制条件保证了对于重复的字符，我们一定是从左往右依次填入的空位中的。

代码

C++JavaC#JavaScriptGolangC

class Solution {
List<String> rec;
boolean[] vis;

    public String[] permutation(String s) {
        int n = s.length();
        rec = new ArrayList<String>();
        vis = new boolean[n];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuffer perm = new StringBuffer();
        backtrack(arr, 0, n, perm);
        int size = rec.size();
        String[] recArr = new String[size];
        for (int i = 0; i < size; i++) {
            recArr[i] = rec.get(i);
        }
        return recArr;
    }

    public void backtrack(char[] arr, int i, int n, StringBuffer perm) {
        if (i == n) {
            rec.add(perm.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            perm.append(arr[j]);
            backtrack(arr, i + 1, n, perm);
            perm.deleteCharAt(perm.length() - 1);
            vis[j] = false;
        }
    }
}
复杂度分析

时间复杂度：O(n×n!)，其中 n 为给定字符串的长度。这些字符的全部排列有 O(n!) 个，每个排列平均需要 O(n) 的时间来生成。

空间复杂度：O(n)。我们需要 O(n) 的栈空间进行回溯，注意返回值不计入空间复杂度。
