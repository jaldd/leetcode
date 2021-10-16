package str.q6.reverse.middle.q294.solution2;

public class Solution {

    public boolean canWin(String s) {

        for (int i = -1; (i = s.indexOf("++", i + 1)) > 0; ) {
            if (canWin(s.substring(0, i) + "--" + s.substring(i + 2))) {
                return false;
            }
        }
        return true;
    }
}