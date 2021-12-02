package str.q6.reverse.middle.q151.solution1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public String reverseWords(String s) {

        s = s.trim();
        List<String> res = Arrays.asList(s.split("\\s+"));
        Collections.reverse(res);
        return String.join(" ", res);
    }
}