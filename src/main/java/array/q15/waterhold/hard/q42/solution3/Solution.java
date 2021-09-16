package array.q15.waterhold.hard.q42.solution3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    public int trap(int[] height) {

        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<>();
        while (current < height.length) {
            //如果栈不空并且当前指向的高度大于栈顶高度就一直循环
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {

                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current++);
        }
        return ans;
    }
}
