方法二：递归法实现子集枚举
思路

与方法一类似，在递归时，若发现没有选择上一个数，且当前数字与上一个数相同，则可以跳过当前生成的子集。

代码

C++JavaGolangJavaScript

class Solution {
List<Integer> t = new ArrayList<Integer>();
List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;
    }

    public void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        dfs(false, cur + 1, nums);
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) {
            return;
        }
        t.add(nums[cur]);
        dfs(true, cur + 1, nums);
        t.remove(t.size() - 1);
    }
}
复杂度分析

时间复杂度：O(n × 2^n)，其中 n 是数组 nums 的长度。排序的时间复杂度为 O(nlogn)。最坏情况下 nums 中无重复元素，需要枚举其所有 2^n个子集，每个子集加入答案时需要拷贝一份，
耗时 O(n)，一共需要 O(n × 2^n)+O(n)=O(n × 2^n) 的时间来构造子集。由于在渐进意义上 O(nlogn) 小于 O(n × 2^n)，故总的时间复杂度为 O(n × 2^n)。

空间复杂度：O(n)。临时数组 t 的空间代价是 O(n)，递归时栈空间的代价为 O(n)。