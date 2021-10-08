package str.q6.reverse.easy.q345.solution1;

public class Solution {

    public String reverseVowels(String s) {

        int length = s.length();
        char[] ch = s.toCharArray();
        int left = 0, right = length - 1;
        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
                right--;
            }
            if (left < right) {
                swap(ch, left, right);
                left++;
                right--;
            }
        }
        return String.valueOf(ch);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}