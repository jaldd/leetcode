package l2025.l09.l04;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {

        // 边界条件检查
        if (intervals.length <= 1) return intervals;

        List<int[]> res = new ArrayList<>();
        // 按照区间的起始位置排序
        Arrays.sort(intervals, Comparator.comparing(list -> list[0]));

        // 将第一个区间加入结果
        res.add(intervals[0]);

        // 从第二个区间开始遍历
        // 获取结果中的最后一个区间
        // 判断是否重叠：当前区间的起始 <= 上一个区间的结束
        // 合并区间：更新结束位置为两者中的较大值
        // 不重叠，直接添加当前区间
        for (int i = 1; i < intervals.length; i++) {

            int[] last = res.get(res.size() - 1);
            int[] interval = intervals[i];
            if (interval[0] > last[1]) {
                res.add(interval);
                continue;
            }
            if (interval[1] > last[1]) {
                last[1] = interval[1];
            }
        }


        // 转换为数组返回
        return res.toArray(new int[res.size()][]);
    }
}
