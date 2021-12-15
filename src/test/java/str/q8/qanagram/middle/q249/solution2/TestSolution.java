package str.q8.qanagram.middle.q249.solution2;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestSolution {

    @Test
    public void testGroupStrings() {

        List<String> sources = new ArrayList<>();
        sources.add("abc");
        sources.add("bcd");
        sources.add("acef");
        sources.add("xyz");
        sources.add("az");
        sources.add("ba");
        sources.add("a");
        sources.add("z");

        List<List<String>> res = new ArrayList<>();
        List<String> res1 = new ArrayList<>();
        List<String> res2 = new ArrayList<>();
        List<String> res3 = new ArrayList<>();
        List<String> res4 = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        res.add(res3);
        res.add(res4);

        res1.add("abc");
        res1.add("bcd");
        res1.add("xyz");

        res2.add("acef");

        res3.add("az");
        res3.add("ba");

        res4.add("a");
        res4.add("z");

        Solution solution = new Solution();
        List<List<String>> realRes = solution.groupStrings(sources);
        Assert.assertEquals(realRes, res);

    }
}