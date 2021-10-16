BFS


class Solution {
vector<string> l = {"0","1","6","8","9"};
vector<string> r = {"0","1","9","8","6"};
int ans = 0;
public:
int strobogrammaticInRange(string low, string high) {
if(low.size() > high.size() || (low.size()==high.size() && low > high))
return 0;
queue<string> q;
q.push("");
q.push("0");
q.push("1");
q.push("8");
string num;
while(!q.empty())
{
num = q.front();
q.pop();
if(num.size() > high.size())
continue;
if(num.size()>=low.size() && num.size() <= high.size())
{
if(num.size()==low.size() && num < low)
continue;
if(num.size()==high.size() && num > high)
continue;
if(num.size() == 1 || num[0]!='0')
ans++;
}
for(int i = 0; i < 5; ++i)
q.push(l[i]+num+r[i]);
}
return ans;
}
};