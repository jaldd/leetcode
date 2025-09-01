package l2025.l09.l01;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 测试用例1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("测试1结果: [" + result1[0] + ", " + result1[1] + "]");
        
        // 测试用例2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("测试2结果: [" + result2[0] + ", " + result2[1] + "]");
        
        // 测试用例3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("测试3结果: [" + result3[0] + ", " + result3[1] + "]");
    }
}
