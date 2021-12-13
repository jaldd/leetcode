package str.q8.qanagram.middle.q49.solution1;

import str.q8.qanagram.middle.q49.AbstractSolution;

import java.util.*;

public class Solution extends AbstractSolution {

    @Override
    protected String getKey(String str) {

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}