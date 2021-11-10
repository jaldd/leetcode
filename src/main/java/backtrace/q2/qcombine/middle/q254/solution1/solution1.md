class Solution {
vector<vector<int>> ans;
public:
vector<vector<int>> getFactors(int n) {
return dfs(n, 2);
}
vector<vector<int>> dfs(int n, int div)//从div开始找因子
{
vector<vector<int>> factor, temp;
for(int i = div; i*i <= n; ++i)
{
if(n%i == 0)
{
factor.push_back({n/i,i});//因子
temp = dfs(n/i, i);//一个较大的因子，从较小的因子开始继续分割
for(auto f : temp)// n/i 分割后的因子组合f
{
f.push_back(i);//加上因子 i
factor.push_back(f);//完整的组合放入答案
}
}  		
}
return factor;//返回答案
}
};