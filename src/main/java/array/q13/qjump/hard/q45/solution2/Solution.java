package array.q13.qjump.hard.q45.solution2;

public class Solution {

    public int jump(int[] nums) {

        int length = nums.length, end = 0, position = 0, steps = 0;

        for (int i = 0; i < length - 1; i++) {

            position = Math.max(position, i + nums[i]);
            if (i == end) {
                end = position;
                steps++;
            }
        }

        return steps;
    }
}
