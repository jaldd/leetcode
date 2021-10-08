package str.q5.q387.solution3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {

    public int firstUniqChar(String s) {

        Map<Character, Integer> position = new HashMap<Character, Integer>();
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {

            if (!position.containsKey(s.charAt(i))) {
                position.put(s.charAt(i), i);
                queue.add(new Pair(s.charAt(i), i));
                continue;
            }

            position.put(s.charAt(i), -1);
            while (!queue.isEmpty() && position.get(queue.peek().ch) == -1) {
                queue.poll();
            }
        }
        return queue.isEmpty() ? -1 : queue.poll().pos;
    }

    class Pair {
        char ch;
        int pos;

        Pair(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }
}