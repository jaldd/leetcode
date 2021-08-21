package array.q11.q229.solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<Integer> majorityElement(int[] nums) {

        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        List<Integer> res = new ArrayList<>();

        int count1 = 0, count2 = 0;
        int data1 = 0, data2 = 0;

        for (int num : nums) {

            if (data1 == num) {
                count1++;
                continue;
            }

            if (data2 == num) {
                count2++;
                continue;
            }

            if (count1 == 0) {
                data1 = num;
                continue;
            }

            if (count2 == 0) {
                data2 = num;
                continue;
            }

            count1--;
            count2--;
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (data1 == nums[i]) count1++;
            if (data2 == nums[i]) count2++;
        }

        if (count1 > nums.length / 3) res.add(data1);

        if (count2 > nums.length / 3) res.add(data2);

        return res;
    }


    public List<Integer> majorityElement1(int[] nums) {
        // 创建返回值
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        // 初始化两个候选人candidate，和他们的计票
        int cand1 = nums[0], count1 = 1;
        int cand2 = nums[0], count2 = 1;

        // 摩尔投票法，分为两个阶段：配对阶段和计数阶段
        // 配对阶段
        for (int num : nums) {
            // 投票
            if (cand1 == num) {
                count1++;
                continue;
            }
            if (cand2 == num) {
                count2++;
                continue;
            }

            // 第1个候选人配对
            if (count1 == 0) {
                cand1 = num;
                count1++;
                continue;
            }
            // 第2个候选人配对
            if (count2 == 0) {
                cand2 = num;
                count2++;
                continue;
            }

            count1--;
            count2--;
        }

        // 计数阶段
        // 找到了两个候选人之后，需要确定票数是否满足大于 N/3
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (cand1 == num) count1++;
            else if (cand2 == num) count2++;
        }

        if (count1 > nums.length / 3) res.add(cand1);
        if (count2 > nums.length / 3) res.add(cand2);

        return res;
    }
}
