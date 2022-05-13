package concurrent.q1;

import java.util.concurrent.Semaphore;

public class SemaphoreABC {

    public Semaphore semaphoreA = new Semaphore(1);
    public Semaphore semaphoreB = new Semaphore(0);
    public Semaphore semaphoreC = new Semaphore(0);

}
