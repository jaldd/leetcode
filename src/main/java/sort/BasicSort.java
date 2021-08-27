package sort;

import java.util.ArrayList;
import java.util.List;

//基数排序
public class BasicSort {

    public void sort(int a[]) {

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int times = 0;
        while (max > 0) {
            max = max / 10;
            times++;
        }
        List<List> queue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Integer> q = new ArrayList<>();
            queue.add(q);
        }
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < a.length; j++) {
                int x = a[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                List<Integer> q = queue.get(x);
                q.add(a[j]);
            }
            int count = 0;
            for (int z = 0; z < 10; z++) {
                while (queue.get(z).size() > 0) {
                    List<Integer> c = queue.get(z);
                    a[count] = c.get(0);
                    c.remove(0);
                    count++;
                }
            }
        }
    }
}
