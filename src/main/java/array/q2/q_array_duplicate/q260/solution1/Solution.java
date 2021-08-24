package array.q2.q_array_duplicate.q260.solution1;

class Solution {

    public int[] singleNumber(int[] nums) {

        //把所有的元素进行异或操作，最终得到一个异或值。因为是不同的两个数字，所以这个值必定不为 0；

        int mask = 0;

        for (int i = 0; i < nums.length; i++) {
            mask ^= nums[i];
        }

        //取异或值最后一个二进制位为 1 的数字作为 mask，如果是 1 则表示两个数字在这一位上不同。

        int tag = 1;
        while ((tag & mask) == 0) {
            tag <<= 1;
        }

        //通过与这个 mask 进行与操作，如果为 0 的分为一个数组，为 1 的分为另一个数组。这样就把问题降低成了：“有一个数组每个数字都出现两次，
        //有一个数字只出现了一次，求出该数字”。对这两个子问题分别进行全异或就可以得到两个解。也就是最终的数组了。

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & tag) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};

    }
}
