package str.q6.reverse.easy.q293.solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<String> generatePossibleNextMoves(String s) {

        List<String> res = new ArrayList<>();

        if (s.length() <= 2) {
            return res;
        }

        char[] array = s.toCharArray();

        for (int i = 1; i < s.length(); i++) {
            if (array[i] == '+' && array[i - 1] == '+') {

                array[i] = '-';
                array[i - 1] = '-';
                res.add(String.valueOf(array));
                array[i] = '+';
                array[i - 1] = '+';
            }
        }

        return res;
    }
}