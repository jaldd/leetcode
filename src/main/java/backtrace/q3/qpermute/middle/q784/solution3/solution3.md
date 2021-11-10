方法三： 内置函数库【通过】
思路和算法

集合的笛卡尔乘积是从所有集合中选择每种可能的组合。例如 {1, 2 } x {a, b, c} = {1a, 1b, 1c, 2a, 2b, 2c}。

对于具有内置函数来计算笛卡尔积的语言，可以直接调用内置函数减少工作量。

Python

class Solution(object):
def letterCasePermutation(self, S):
f = lambda x: (x.lower(), x.upper()) if x.isalpha() else x
return map("".join, itertools.product(*map(f, S)))
复杂度分析

时间和空间复杂度：O(2^{N} * N)，与方法一分析相同。