package str.q1.q14.solution2;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        int count = strs.length, length = strs[0].length();
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < count; j++) {
                if(strs[j].charAt(i)!=strs[0].charAt(i)||strs[j].length()==i){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}