package str.q6.reverse.middle.q151.solution3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String reverseWords(String s) {

        int left = 0, right = s.length() - 1;

        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }

        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }

        Deque<String> deque = new ArrayDeque<>();

        StringBuilder stringBuilder = new StringBuilder();
        while (left <= right) {
            if (s.charAt(left) == ' ') {
                deque.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(s.charAt(left));
            }
            left++;
        }

        return String.join(" ", deque);
    }

    public String back(String s) {

        int left = 0, right = s.length() - 1;

        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }

        Deque<String> d = new ArrayDeque<String>();
        StringBuilder word = new StringBuilder();

        while (left <= right) {

            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {
                // 将单词 push 到队列的头部
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        return String.join(" ", d);
    }
}