package str.q8.qanagram.middle.q249.solution1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<List<String>> groupStrings(List<String> strings) {

        Map<List<Integer>, List<String>> map = new HashMap<>();//存储当前结果的特征值，集其包含的字符串
        List<List<String>> res = new ArrayList<>();//最后的结果集
        for (String s : strings) {
            List<Integer> v = new ArrayList<>();
            for (int j = 0; j < s.length() - 1; ++j) {
                int x = s.charAt(j) - s.charAt(j + 1);
                if (x < 0) x += 26;//这里处理越界的情况,根据题目要求，z和a相邻，特征值只相差1，但是直接用a-z的话会为-25，我直接加上26变成1
                v.add(x);
            }
            if (s.length() == 1)//比如a,b,c这种单个的字符，我用-1来代表它们的特征值。
            {
                v.add(-1);
            }
            map.get(v).add(s);//把当前字符串存入对应的特征值的数组中
        }
        for (Map.Entry<List<Integer>, List<String>> e : map.entrySet()) {
            res.add(e.getValue());//最后取出map中的所有结果集
        }
        return res;
    }
}