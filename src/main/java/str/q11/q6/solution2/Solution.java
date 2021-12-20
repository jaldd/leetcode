package str.q11.q6.solution2;

public class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int length = s.length();
        int cycLen = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < length; j += cycLen) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycLen - i < length) {
                    sb.append(s.charAt(j + cycLen - i));
                }
            }
        }
        return sb.toString();
    }
} 