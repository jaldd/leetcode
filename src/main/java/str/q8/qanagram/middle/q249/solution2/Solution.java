package str.q8.qanagram.middle.q249.solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个辅助方法 isShifted(String s, String t) 表示字符串 s 是否可以通过移位变为 t。
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

    public List<List<String>> groupStrings(List<String> strings) {

        List<List<String>> res = new ArrayList<>();
        boolean[] isAdded = new boolean[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            List<String> list = new ArrayList<>();
            if (isAdded[i]) {
                continue;
            }
            list.add(strings.get(i));
            isAdded[i] = true;
            for (int j = i + 1; j < strings.size(); j++) {
                if (!isAdded[j] && isShifted(strings.get(i), strings.get(j))) {
                    list.add(strings.get(j));
                    isAdded[j] = true;
                }
            }
            res.add(list);
        }
        return res;
    }

    /**
     * s 可以移位变为 t
     *
     * @param s
     * @param t
     * @return
     */
    private boolean isShifted(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        int differ = s.charAt(0) - t.charAt(0);
        int tmp = differ < 0 ? 26 + differ : differ;
        for (int i = 1; i < s.length(); i++) {
            int curDiffer = s.charAt(i) - t.charAt(i);
            int curTmp = curDiffer < 0 ? 26 + curDiffer : curDiffer;
            if (tmp != curTmp) {
                return false;
            }
        }
        return true;
    }
}