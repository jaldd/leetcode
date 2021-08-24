package array.q12.q202.solution2;

public class Solution {

    public int squareSum(int n) {

        int digit = 0, sum = 0;
        while (n > 0) {
            digit = n % 10;
            sum += Math.pow(digit, 2);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        int low = n, fast = squareSum(n);
        while (low != fast) {
            low = squareSum(low);
            fast = squareSum(squareSum(fast));
        }

        return low == 1;
    }
}