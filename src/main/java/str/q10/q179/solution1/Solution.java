package str.q10.q179.solution1;

import str.q8.qanagram.middle.q49.AbstractSolution;

import java.util.Arrays;

public class Solution {

    public String largestNumber(int... nums) {

        int length = nums.length;
        Integer[] numsArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numsArr[i] = nums[i];
        }
        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });
        if (numsArr[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (Integer num : numsArr) {
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "123";
        String b = "234";
        System.out.println(b.compareTo(a));
    }

}