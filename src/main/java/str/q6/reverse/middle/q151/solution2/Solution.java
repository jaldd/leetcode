package str.q6.reverse.middle.q151.solution2;

import basic.AbstractSwap;

public class Solution extends AbstractSwap {

    public String reverseWords(String s) {

        //去前后空格
        String words = trimWords(s);
        if (words.length() <= 1) {
            return words;
        }
        System.out.println(words);
        char[] array = words.toCharArray();
        System.out.println(String.valueOf(array));
        //反正整个字符串
        reverse(array, 0, array.length - 1);
        System.out.println(String.valueOf(array));
        //翻转每个单词
        reverseWord(array);
        System.out.println(String.valueOf(array));

        return String.valueOf(array);
    }

    private void reverseWord(char[] words) {

        int pre = 0;
        for (int i = 1; i < words.length; i++) {

            if (words[i] == ' ') {
                reverse(words, pre, i - 1);
                pre = i + 1;
            }

        }
        reverse(words, pre, words.length - 1);

    }

    private void reverse(char[] words, int l, int r) {

        for (; l < r; l++, r--) {

            swap(words, l, r);
        }
    }

    private String trimWords(String s) {

        StringBuilder sb = new StringBuilder();
        int left = 0, right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        while (left <= right) {
            if (s.charAt(left) == ' ' && s.charAt(left - 1) == ' ') {
                left++;
                continue;
            }
            sb.append(s.charAt(left));
            left++;
        }
        return sb.toString();
    }


    //    StringBuilder sb = trimSpaces(s);
//
//    // 翻转字符串
//    reverse(sb, 0, sb.length() - 1);
//
//    // 翻转每个单词
//    reverseEachWord(sb);
//
//        return sb.toString();
    public StringBuilder trimSpaces1(String s) {

        int left = 0, right = s.length() - 1;

        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        // 将字符串间多余的空白字符去除
        StringBuilder sb = new StringBuilder();
        while (left <= right) {

            char c = s.charAt(left);

            if (c != ' ') {
                sb.append(c);
            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }

            ++left;
        }
        return sb;
    }

    public void reverseSb(StringBuilder sb, int left, int right) {

        while (left < right) {

            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public void reverseEachWord1(StringBuilder sb) {

        int n = sb.length();
        int start = 0, end = 0;

        while (start < n) {
            // 循环至单词的末尾
            while (end < n && sb.charAt(end) != ' ') {
                ++end;
            }
            // 翻转单词
            reverseSb(sb, start, end - 1);
            // 更新start，去找下一个单词
            start = end + 1;
            ++end;
        }
    }
}