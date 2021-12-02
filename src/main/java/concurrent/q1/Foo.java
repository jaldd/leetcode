package concurrent.q1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    public Foo() {

    }


    public static void main(String[] args) {

        int[] char1 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] char2 = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] char3 = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();
        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);
        Thread t1 = new Thread(() -> {

            lock.lock();
            latch1.countDown();
            try {
                for (int c1 : char1) {
                    System.out.println(c1);
                    condition2.signal();
                    condition1.await();
                }

                condition2.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });

        Thread t2 = new Thread(() -> {

            try {
                latch1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            try {
                latch2.countDown();
                for (int c2 : char2) {
                    System.out.println(c2);
                    condition3.signal();
                    condition2.await();
                }
                condition3.signal();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }


        });

        Thread t3 = new Thread(() -> {

            try {
                latch2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            try {
                for (int c3 : char3) {
                    System.out.println(c3);
                    condition1.signal();
                    condition3.await();
                }
                condition1.signal();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        t3.start();
        t1.start();
        t2.start();

    }


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}