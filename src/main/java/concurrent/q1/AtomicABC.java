package concurrent.q1;

import java.util.concurrent.atomic.AtomicInteger;

//交替打印ABC
public class AtomicABC {

    private AtomicInteger count = new AtomicInteger(0);

    Thread a = new Thread(() -> {
        pintA();
    });
    Thread b = new Thread(() -> {
        printB();
    });
    Thread c = new Thread(() -> {
        printC();
    });

    public void pintA() {

        while (true) {
            while (count.get() != 0) {
                continue;
            }
            System.out.println("A");
            count.incrementAndGet();
        }
    }

    public void printB() {
        while (true) {
            while (count.get() != 1) {
                continue;
            }
            System.out.println("B");
            count.incrementAndGet();
        }
    }

    public void printC() {
        while (true) {
            while (count.get() != 2) {
                continue;
            }
            System.out.println("C");
            count = new AtomicInteger(0);
        }
    }


    public static void main(String[] args) {
        AtomicABC syncABC = new AtomicABC();
        syncABC.run();
    }

    private void run() {
        a.start();
        b.start();
        c.start();
    }
}
