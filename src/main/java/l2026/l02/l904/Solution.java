package l2026.l02.l904;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {

        int length = fruits.length;
        int left = 0;
        int res = 0;
        Map<Integer, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int type = fruits[i];
            int current = windowMap.getOrDefault(type, 0);
            current++;
            windowMap.put(type, current);

            while (windowMap.size() > 2) {

                int lefttype = fruits[left];
                Integer leftCurrent = windowMap.get(lefttype);
                leftCurrent--;
                if (leftCurrent == 0) {
                    windowMap.remove(lefttype);
                } else {
                    windowMap.put(lefttype, leftCurrent);
                }
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().totalFruit(new int[]{1, 2, 1}));
        System.out.println(new Solution().totalFruit(new int[]{0, 1, 2, 2}));
    }
}