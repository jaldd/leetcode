package str.q6.reverse.easy.q344.solution1;

import sort.AbstractSort;

public class Solution extends AbstractSort {

    public void reverseString(char[] s) {

        for (int l = 0, r = s.length - 1; l < r; l++, r--) {
            swap(s, l, r);
        }
    }
}