package sort.quick;

import java.util.Deque;
import java.util.LinkedList;

public class QuickSort3 {

    public void sort(int[] arr) {

        Deque<int[]> deque = new LinkedList<>();
        deque.push(new int[]{0, arr.length - 1});
        while (!deque.isEmpty()) {
            int[] tmp = deque.pop();
            int q = sort(arr, tmp[0], tmp[1]);
            if (tmp[0] < q - 1) {
                deque.push(new int[]{tmp[0], q - 1});
            }
            if (tmp[1] > q + 1) {
                deque.push(new int[]{q + 1, tmp[1]});
            }
        }
    }

    public int sort(int[] arr, int left, int right) {
        if (left < right) {
            int current = left;
            for (int i = 0; i < arr.length; i++) {

            }
        }
        return left;
    }
}
