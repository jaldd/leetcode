package n2025.l76;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();
        if (tLength > sLength) {
            return "";
        }
        int need = 0;
        int[] needCount = new int[128];
        int valid = 0;
        int[] window = new int[128];
        int start = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        for (char c : t.toCharArray()) {
            if (needCount[c] == 0) {
                need++;
            }
            needCount[c]++;
        }

        for (int right = 0; right < sLength; right++) {
            int rightIndex = s.charAt(right);
            window[rightIndex]++;
            if (window[rightIndex] == needCount[rightIndex]) {
                valid++;
            }

            while (valid == need) {
                int curLen = right - left + 1;
                if (minLen > curLen) {
                    minLen = curLen;
                    start = left;
                }
                int leftIndex = s.charAt(left);
                if (needCount[leftIndex] > 0) {
                    if (window[leftIndex] == needCount[leftIndex]) {
                        valid--;
                    }
                    window[leftIndex]--;
                }

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }


    public String minWindow1(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            return "";
        }
        int[] tCount = new int[128];
        int[] sCount = new int[128];
        int distinctT = 0;
        for (int i = 0; i < tLength; i++) {
            int tIndex = t.charAt(i);
            if (tCount[tIndex] == 0) {
                distinctT++;
            }
            tCount[tIndex]++;
        }
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int start = 0;
        int match = 0;
        for (int r = 0; r < sLength; r++) {
            int rIndex = s.charAt(r);
            if (tCount[rIndex] > 0) {
                sCount[rIndex]++;
                if (sCount[rIndex] == tCount[rIndex]) {
                    match++;
                }
            }
            while (match == distinctT) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                int lIndex = s.charAt(l);
                if (tCount[lIndex] > 0) {
                    if (sCount[lIndex] == tCount[lIndex]) {
                        match--;
                    }
                    sCount[lIndex]--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        String s = "AAABBBCCC";
        String t = "AAB";
        String expected = "AAB";
        String actual = new Solution().minWindow(s, t);
        System.out.println(actual);

    }


    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            map.put(c, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}