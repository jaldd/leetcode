package concurrent.q1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SyncABC {

    private static int count=0;
    private static Object lock = new Object();


    static class ThreadA extends Thread {
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("count:"+count);
                while(count%3!=0){

                }
                synchronized (lock){
                    System.out.println("A");
                    count++;
                }
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("count1:"+count);

                while(count%3!=1){

                }
                synchronized (lock){
                    System.out.println("B");
                    count++;
                }
            }
        }
    }

    static class ThreadC extends Thread {
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println("count2:"+count);

                while(count%3!=2){

                }
                synchronized (lock){
                    System.out.println("C");
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
    }
}
