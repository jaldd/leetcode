package str.q6.reverse.easy.q293.solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<String> generatePossibleNextMoves(String s) {

        List<String> res = new ArrayList<>();
        char[] sc = s.toCharArray();
        //处理特殊的情形
        if (s.length() < 2) {
            return res;
        }
//        List<String> res;
        //遍历所有的可能的结果
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == '+' && s.charAt(i) == '+') {

                //反转
                sc[i - 1] = '-';
                sc[i] = '-';
                res.add(String.valueOf(sc));//压入
                //复原
                sc[i - 1] = '+';
                sc[i] = '+';
            }
        }
        return res;
    }
}