package str.q6.reverse.easy.q345.solution1;

import basic.AbstractSwap;
import basic.Utils;

public class Solution extends AbstractSwap {

    public String reverseVowels(String s) {

        int length = s.length();
        char[] ch = s.toCharArray();
        int left = 0, right = length - 1;
        while (left < right) {
            while (left < right && !Utils.isVowel(ch[left])) {
                left++;
            }
            while (left < right && !Utils.isVowel(ch[right])) {
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

}