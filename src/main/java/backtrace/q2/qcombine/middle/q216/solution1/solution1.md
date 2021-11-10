方法一：二进制（子集）枚举
思路与算法

「组合中只允许含有 1−9 的正整数，并且每种组合中不存在重复的数字」意味着这个组合中最多包含 9 个数字。我们可以把原问题转化成集合 S={1,2,3,4,5,6,7,8,9}，我们要找出 S 的当中满足如下条件的子集：

大小为 k集合中元素的和为 n因此我们可以用子集枚举的方法来做这道题。即原序列中有 9 个数，每个数都有两种状态，「被选择到子集中」和「不被选择到子集中」，所以状态的总数为 2^9。
我们用一个 9 位二进制数 mask 来记录当前所有位置的状态，从第到高第 i 位为 0 表示 i 不被选择到子集中，为 1 表示 i 被选择到子集中。当我们按顺序枚举 [0, 2^9 - 1] 中的所有整数的时候，
就可以不重不漏地把每个状态枚举到，对于一个状态 mask，我们可以用位运算的方法得到对应的子集序列，然后再判断是否满足上面的两个条件，如果满足，就记录答案。

如何通过位运算来得到 mask 各个位置的信息？对于第 ii 个位置我们可以判断 (1 << i) & mask 是否为 0，如果不为 0 则说明 i 在子集当中。当然，这里要注意的是，一个 9 位二进制数 i 的范围是
[0,8]，而可选择的数字是 [1,9]，所以我们需要做一个映射，最简单的办法就是当我们知道 i 位置不为 0 的时候将 i+1 加入子集。

当然，子集枚举也可以用递归实现。在「77. 组合的官方题解」的方法一中提及了子集枚举递归实现的基本框架，感兴趣的同学可以参考。

代码如下。

代码

C++JavaJavaScriptGolangC

class Solution {
List<Integer> temp = new ArrayList<Integer>();
List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        for (int mask = 0; mask < (1 << 9); ++mask) {
            if (check(mask, k, n)) {
                ans.add(new ArrayList<Integer>(temp));
            }
        }
        return ans;
    }

    public boolean check(int mask, int k, int n) {
        temp.clear();
        for (int i = 0; i < 9; ++i) {
            if (((1 << i) & mask) != 0) {
                temp.add(i + 1);
            }
        }
        if (temp.size() != k) {
            return false;
        }
        int sum = 0;
        for (int num : temp) {
            sum += num;
        }
        return sum == n;
    }
}
复杂度分析

时间复杂度：O(M × 2^M)，其中 M 为集合的大小，本题中 M 固定为 9。一共有 2^M个状态，每个状态需要 O(M+k)=O(M) 的判断 （k≤M），故时间复杂度为 O(M × 2^M)。
空间复杂度：O(M)。即 temp 的空间代价。
