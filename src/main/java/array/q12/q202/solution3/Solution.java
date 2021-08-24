package array.q12.q202.solution3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static Set<Integer> cycleMembers =
            new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while (n != 1 && !cycleMembers.contains(n)) {
            set.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {

        int total_sum = 0, digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
        }
        total_sum += Math.pow(digit, 2);
        return total_sum;

    }
}
