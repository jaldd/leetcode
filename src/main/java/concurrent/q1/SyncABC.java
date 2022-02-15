package concurrent.q1;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncABC {

    private Object lock = new Object();
    private int count = 0;


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
            synchronized (lock) {
                while (count % 3 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                System.out.println("A");
                count++;
                lock.notifyAll();
            }
        }
    }

    public void printB() {
        while (true) {
            synchronized (lock) {
                while (count % 3 != 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                System.out.println("B");
                count++;
                lock.notifyAll();
            }
        }
    }

    public void printC() {
        while (true) {
            synchronized (lock) {
                while (count % 3 != 2) {

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }
                System.out.println("C");
                count++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        SyncABC syncABC = new SyncABC();
        syncABC.run();
    }

    private void run() {
        a.start();
        b.start();
        c.start();
    }
}
