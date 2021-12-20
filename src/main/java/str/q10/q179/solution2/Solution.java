package str.q10.q179.solution2;

import java.util.Arrays;

public class Solution {

    public String largestNumber(int... nums) {

        int length = nums.length;
        String[] numArr = new String[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = "" + nums[i];
        }
        Arrays.sort(numArr, (x, y) -> {
            String sx = x + y, sy = y + x;
            return sy.compareTo(sx);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : numArr) {
            sb.append(s);
        }
        int slen = sb.length();
        int k = 0;
        while (k < slen - 1 && sb.charAt(k) == '0'){
            k++;
        }
        return sb.substring(k);
    }

    public static void main(String[] args) {
        String a = "123";
        String b = "234";
        System.out.println(b.compareTo(a));
    }

}