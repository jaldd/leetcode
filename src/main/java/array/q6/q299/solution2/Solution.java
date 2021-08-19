package array.q6.q299.solution2;

public class Solution {
    public String getHint(String secret, String guess) {

        int[] secretArray = new int[10];

        int[] guessArray = new int[10];

        int A = 0, B = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
            } else {
                secretArray[secret.charAt(i) - '0']++;
                guessArray[guess.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            B += Math.min(secretArray[i], guessArray[i]);
        }

        return A + "A" + B + 'B';


//        // secretArray 和 guessArray 分别记录 两个字符串中非公牛的各个数字的数量
//        int[] secretArray = new int[10];
//        int[] guessArray = new int[10];
//        // 公牛
//        int A = 0;
//        for (int i = 0; i < secret.length(); i++) {
//            // 如果同位的数字相等则，公牛++
//            if (secret.charAt(i) == guess.charAt(i)) {
//                A++;
//            } else {
//                secretArray[secret.charAt(i) - '0']++;
//                guessArray[guess.charAt(i) - '0']++;
//            }
//        }
//        // 奶牛
//        int B = 0;
//        for (int i = 0; i < 10; i++) {
//            // 不同位上的相同数字的数量
//            B += Math.min(secretArray[i], guessArray[i]);
//        }
//        return String.valueOf(A) + 'A' + B + 'B';
    }
}