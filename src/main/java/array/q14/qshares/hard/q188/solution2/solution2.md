![img.png](img.png)

![img_1.png](img_1.png)
![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)
![img_6.png](img_6.png)
![img_7.png](img_7.png)
对于这种情况，我们可以在求解子问题时，尽可能地多进行交易，求解出最大的那个 k 值。从本质上来说，红色的点与绿色的点之间实际上只是相差了若干笔收益为 0 的交易而已，因此它们之间都是可以互相转换的。


复杂度分析

时间复杂度：O(nlogC)，其中 n 是数组 prices 的长度，C 是数组 prices 中的最大值，在本题中 C≤1000。

空间复杂度：O(1)。

