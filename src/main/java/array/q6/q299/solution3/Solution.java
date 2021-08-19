package array.q6.q299.solution3;

public class Solution {

    public String getHint(String secret, String guess) {
        int[] array = new int[10];
        int a = 0, b = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
            } else {

                if (array[secret.charAt(i) - '0']++ < 0) {
                    b++;
                }

                if (array[guess.charAt(i) - '0']-- > 0) {
                    b++;
                }

            }
        }
        return a + "A" + b + "B";

    }

    public static void main(String[] args) {
        int i = -1;
        System.out.println(i++ < 0);
        System.out.println(i);
    }
}
