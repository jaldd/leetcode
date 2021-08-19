方法一：一次遍历
思路与算法

最容易想到的解法是：从头到尾遍历每个加油站，并检查以该加油站为起点，最终能否行驶一周。我们可以通过减小被检查的加油站数目，来降低总的时间复杂度。

假设我们此前发现，从加油站 xx 出发，每经过一个加油站就加一次油（包括起始加油站），最后一个可以到达的加油站是 yy（不妨设 x<yx<y）。这就说明：

\sum_{i=x}^{y}it{gas}[i] < \sum_{i=x}^{y}it{cost}[i] \\ \sum_{i=x}^{j}gas[i] \ge \sum_{i=x}^{j}cost[i] ~ {(For all $j \in [x, y)$) }
i=x
∑
y
​
gas[i]<
i=x
∑
y
​
cost[i]
i=x
∑
j
​
gas[i]≥
i=x
∑
j
​
cost[i] (For all j∈[x,y))

第一个式子表明无法到达加油站 yy 的下一个加油站，第二个式子表明可以到达 yy 以及 yy 之前的所有加油站。

现在，考虑任意一个位于 x,yx,y 之间的加油站 zz（包括 xx 和 yy），我们现在考察从该加油站出发，能否到达加油站 yy 的下一个加油站，也就是要判断 \sum_{i=z}^{y}it{gas}[i]∑
i=z
y
​
gas[i] 与 \sum_{i=z}^{y}it{cost}[i]∑
i=z
y
​
cost[i] 之间的大小关系。

根据上面的式子，我们得到：

\begin{aligned} \sum_{i=z}^{y}it{gas}[i]&=\sum_{i=x}^{y}it{gas}[i]-\sum_{i=x}^{z-1}it{gas}[i] \\ &< \sum_{i=x}^{y}it{cost}[i]-\sum_{i=x}^{z-1}it{gas}[i] \\ &< \sum_{i=x}^{y}it{cost}[i]-\sum_{i=x}^{z-1}cost[i] \\ &= \sum_{i=z}^{y}it{cost}[i] \end{aligned}
i=z
∑
y
​
gas[i]
​
  
= 
i=x
∑
y
​
gas[i]−
i=x
∑
z−1
​
gas[i]
<
i=x
∑
y
​
cost[i]−
i=x
∑
z−1
​
gas[i]
<
i=x
∑
y
​
cost[i]−
i=x
∑
z−1
​
cost[i]
=
i=z
∑
y
​
cost[i]
​


其中不等式的第二步、第三步分别利用了上面的第一个、第二个不等式。

从上面的推导中，能够得出结论：从 x,yx,y 之间的任何一个加油站出发，都无法到达加油站 yy 的下一个加油站。

在发现了这一个性质后，算法就很清楚了：我们首先检查第 0 个加油站，并试图判断能否环绕一周；如果不能，就从第一个无法到达的加油站开始继续检查。

代码

C++JavaGolangCJavaScript

复杂度分析

时间复杂度：O(N)，其中 N 为数组的长度。我们对数组进行了单次遍历。

空间复杂度：O(1)。
