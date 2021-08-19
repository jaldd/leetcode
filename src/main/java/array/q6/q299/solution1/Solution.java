package array.q6.q299.solution1;

class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
                continue;
            }
            if (guess.contains(String.valueOf(secret.charAt(i)))) {
                b++;
            }
        }

        return a + "A" + b + "B";
    }
}