package str.q8.qanagram.middle.q249.solution2;

import java.util.ArrayList;
import java.util.List;

/**
 *  定义一个辅助方法 isShifted(String s, String t) 表示字符串 s 是否可以通过移位变为 t。
 * <p>
 * 1、如果 s 和 t 长度不一致，肯定无法通过移位进行转换，返回 false；
 * <p>
 * 2、如果 s 和 t 长度一致，且长度为 1，则肯定可以移位转换；
 * <p>
 * 3、如果 s 和 t 长度一致且不为 1，则可以移位进行转换的判断是 s 的每一个字符都移动相同的步数变为 s。
 * <p>
 * 例如：“abc” 的每一个字符移动 3 次变为 “def”。而 “abc” 无法经过统一的步数变为 “dkz”。
 * <p>
 * 有了 isShifted(String s, String t) 方法，则问题变得很简单：
 * <p>
 * 1、遍历字符串数组；
 * <p>
 * 2、如果 strings[i] 已经被使用过了，则跳过；如果没有被使用过，添加到 List 中；
 * <p>
 * 3、从 [i+1, strings.length-1] 中找到 isShifted(strings[i], strings[j]) 为 true 的添加到 List 中，并把 strings[j] 设置为已使用。
 * <p>
 * 4、返回 List 的总和。
 */

public class Solution {

    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] isAdded = new boolean[strings.length];
        for (int i = 0; i < strings.length; i++) {
            List<String> list = new ArrayList<>();
            if (isAdded[i]) {
                /// 如果该字符串已经添加，则跳过
                continue;
            } else {
                // 该字符串没被添加，则加入到 list
                list.add(strings[i]);
            }
            // 找到 strings[i] 的所有移位，并添加到 list 中
            for (int j = i + 1; j < strings.length; j++) {
                // 第 j 个字符串没有添加过，且 strings[i] 可以移位变为 strings[j]
                if (!isAdded[j] && isShifted(strings[i], strings[j])) {
                    list.add(strings[j]);
                    isAdded[j] = true;
                }
            }
            ans.add(list);
        }
        return ans;
    }

    /**
     * s 可以移位变为 t
     *
     * @param s
     * @param t
     * @return
     */
    private boolean isShifted(String s, String t) {
        if (s.length() != t.length()) return false; // 长度不相同，肯定不能移位 s 变为 t
        if (s.length() == 1) return true;   // 长度相同，且长度为 1，可以移位 s 变为 t
        int gap = 0;    // 字符串相邻字符的间隔，如：ab 的间隔为
        int differ = t.charAt(0) - s.charAt(0);
        if (differ < 0) {
            // 比如 t[0] == 'b'， s[0] == 'a'，则 'b' - 'a' = -1
            // 26 + (-1) = 25，可以看成 'b' 移位了 25 次变为 'a'
            gap = 26 + differ;
        } else {
            gap = differ;
        }
        for (int i = 0; i < s.length(); i++) {
            int curgap = 0; // 当前间隔
            int curDiffer = t.charAt(i) - s.charAt(i);
            if (curDiffer < 0) {
                curgap = 26 + curDiffer;
            } else {
                curgap = curDiffer;
            }
            if (curgap != gap) {
                // s 和 t 每一个位置的字符间隔应该一致才能通过移位使得 s 变为 t
                // 例如：ab 就无法移位转为 cf，因为 ab 间隔为 1，cf间隔为 3，a-c移位 2 次，b-f移位 4 次
                return false;
            }
        }
        return true;
    }
}