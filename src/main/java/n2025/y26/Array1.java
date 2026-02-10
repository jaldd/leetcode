package n2025.y26;

public class Array1 {


    public int removeDuplicates(int[] nums) {
        // 你的代码写这里
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Array1().removeDuplicates(nums));
    }
}
