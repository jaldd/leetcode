方法二：哈希表
对于数组中每个元素，我们将它插入到哈希表中。如果插入一个元素时发现该元素已经存在于哈希表中，则说明存在重复的元素。

C++JavaGolangCJavaScript

class Solution {
public:
bool containsDuplicate(vector<int>& nums) {
unordered_set<int> s;
for (int x: nums) {
if (s.find(x) != s.end()) {
return true;
}
s.insert(x);
}
return false;
}
};
复杂度分析

时间复杂度：O(N)，其中 N 为数组的长度。

空间复杂度：O(N)，其中 N 为数组的长度。
