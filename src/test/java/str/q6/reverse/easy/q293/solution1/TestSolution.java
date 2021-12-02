package str.q6.reverse.easy.q293.solution1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        System.out.println();
        Assert.assertArrayEquals(solution.generatePossibleNextMoves("++++").toArray(), new String[]{"--++", "+--+", "++--"});
//        Assert.assertEquals();
//        Assert.assertEquals(solution.firstUniqChar("loveleetcode"), 2);
    }


    private List<String> generatePossibleNextMoves(String s) {
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