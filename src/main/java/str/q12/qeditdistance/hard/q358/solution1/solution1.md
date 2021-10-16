本题的思路是基于贪心的, 先统计每个字符的数量, 为了让字符排列更紧凑, 借助一个优先队列先排列个数大的字符

1. 如果剩余的字符的数量大于k, 那么就需要在接下来排列k个不同的字符, 并将这k个不同字符个数都-1, 如果在排这k个不同字符的时候发现并没有k个不同字符, 说明是无法得到答案的.

2. 如果剩余的字符数量不到k, 那么就在接下排列剩余个数的不同字符. 方法和上面一样.

在优先队列中存储以(数量+字符)的对, 以k为区间大小排列k个从数量高到低的字符, 然后再重复此过程, 这种贪心的策略可以保证让数量大的最优先排列, 并且使其间隔最小的距离, 否则到后来可能没有足够的空间.

代码如下:

class Solution {
public:
string rearrangeString(string str, int k) {
if(k==0) return str;
int len = str.size();
string result;
map<char, int> hash;
for(auto ch: str) hash[ch]++;
priority_queue<pair<int, char>> que;
for(auto val: hash) que.push(make_pair(val.second, val.first));
while(!que.empty())
{
vector<pair<int, int>> vec;
int cnt = min(k, len);
for(int i =0; i < cnt; i++, len--)
{
if(que.empty()) return "";
auto val = que.top();
que.pop();
result += val.second;
if(--val.first>0) vec.push_back(val);
}
for(auto val: vec) que.push(val);
}
return result;
}
}