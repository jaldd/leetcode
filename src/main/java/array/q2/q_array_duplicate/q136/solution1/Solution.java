package array.q2.q_array_duplicate.q136.solution1;

public class Solution {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}