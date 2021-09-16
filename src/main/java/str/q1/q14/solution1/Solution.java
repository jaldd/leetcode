package str.q1.q14.solution1;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {

        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == str2.charAt(i) && index < length) {
                index++;
            }
        }
        return str1.substring(0, index);
    }

//
//    public String longestCommonPrefix(String str1, String str2) {
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (str2.length() == i || str2.charAt(i) != str1.charAt(i)) {
//                return str1.substring(0, i);
//            }
//        }
//        return str1;
//    }


//
//    public String longestCommonPrefix(String str1, String str2) {
//        int length = Math.min(str1.length(), str2.length());
//        int index = 0;
//        while (index < length && str1.charAt(index) == str2.charAt(index)) {
//            index++;
//        }
//        return str1.substring(0, index);
//    }

}