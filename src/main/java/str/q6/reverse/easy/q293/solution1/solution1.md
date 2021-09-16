方法1：
主要思路：
（1）这里只是求第一次反转的所有的可能的结果，故可以直接简单的遍历一遍，直接将相邻的字符都为 + 的字符变成 - ，然后压入到结果中即可；

class Solution {
public:
vector<string> generatePossibleNextMoves(string s) {
//处理特殊的情形
if(s.size()<2){
return {};
}
vector<string> res;
//遍历所有的可能的结果
for(int i=1;i<s.size();++i){
if(s[i-1]=='+'&&s[i]=='+'){
//反转
s[i-1]='-';
s[i]='-';
res.push_back(s);//压入
//复原
s[i-1]='+';
s[i]='+';
}
}
return res;
}
};