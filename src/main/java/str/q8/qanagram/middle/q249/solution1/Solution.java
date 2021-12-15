package str.q8.qanagram.middle.q249.solution1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupStrings(List<String> strings) {

        Map<List<Integer>, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String str : strings) {
            List<Integer> key = new ArrayList<>();
            if (str.length() == 1) {

                key.add(-1);
            } else {
                for (int i = 0; i < str.length() - 1; i++) {

                    int tmp = str.charAt(i) - str.charAt(i + 1);
                    if (tmp < 0) {
                        tmp += 26;
                    }
                    key.add(tmp);
                }
            }
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        for (Map.Entry<List<Integer>, List<String>> entry : map.entrySet()) {

            res.add(entry.getValue());
        }

        return res;

//
//            List<Integer> v = new ArrayList<>();
//            if (s.length() == 1) {//比如a,b,c这种单个的字符，我用-1来代表它们的特征值。
//                v.add(-1);
//            } else {
//                for (int j = 0; j < s.length() - 1; ++j) {
//                    int x = s.charAt(j) - s.charAt(j + 1);
//                    if (x < 0) x += 26;//这里处理越界的情况,根据题目要求，z和a相邻，特征值只相差1，但是直接用a-z的话会为-25，我直接加上26变成1
//                    v.add(x);
//                }
//            }
//        }
    }
}