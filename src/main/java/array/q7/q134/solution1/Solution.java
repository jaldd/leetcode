package array.q7.q134.solution1;

class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int length = gas.length;
        int i = 0;

        while (i < length) {
            int sumGas = 0, sumCost = 0;
            int cnt = 0;

            while (cnt < length) {
                int t = (i + cnt) % length;
                sumGas += gas[t];
                sumCost += cost[t];
                if (sumGas < sumCost) {
                    break;
                }
                cnt++;
            }

            if (cnt == length) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }

        return -1;

    }

}