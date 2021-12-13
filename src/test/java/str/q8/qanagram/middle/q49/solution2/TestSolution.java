package str.q8.qanagram.middle.q49.solution2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        List<List<String>> res1 = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> acquire1 = new ArrayList<>();
        acquire1.add(Collections.singletonList("bat"));
        acquire1.add(Arrays.asList("tan", "nat"));
        acquire1.add(Arrays.asList("eat", "tea", "ate"));
        Assert.assertEquals(acquire1.toString(), res1.toString());


        List<List<String>> res2 = solution.groupAnagrams(new String[]{""});
        List<List<String>> acquire2 = new ArrayList<>();
        acquire2.add(Collections.singletonList(""));
        Assert.assertEquals(acquire2.toString(), res2.toString());

        List<List<String>> res3 = solution.groupAnagrams(new String[]{"a"});
        List<List<String>> acquire3 = new ArrayList<>();
        acquire3.add(Collections.singletonList("a"));
        Assert.assertEquals(acquire3.toString(), res3.toString());
    }
}