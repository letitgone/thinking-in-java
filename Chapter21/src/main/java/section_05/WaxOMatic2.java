package section_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
class Car2 {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean WaxOn2 = false;

    public void waxed() {
        lock.lock();
        try {
            WaxOn2 = true; // Ready to buff
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void buffed() {
        lock.lock();
        try {
            WaxOn2 = false; // Ready for another coat of wax
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void waitForWaxing() throws InterruptedException {
        lock.lock();
        try {
            while (WaxOn2 == false)
                condition.await();
        } finally {
            lock.unlock();
        }
    }

    public void waitForBuffing() throws InterruptedException {
        lock.lock();
        try {
            while (WaxOn2 == true)
                condition.await();
        } finally {
            lock.unlock();
        }
    }
}


class WaxOn22 implements Runnable {
    private Car2 Car2;

    public WaxOn22(Car2 c) {
        Car2 = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                printnb("Wax On! ");
                TimeUnit.MILLISECONDS.sleep(200);
                Car2.waxed();
                Car2.waitForBuffing();
            }
        } catch (InterruptedException e) {
            print("Exiting via interrupt");
        }
        print("Ending Wax On task");
    }
}


class WaxOff2 implements Runnable {
    private Car2 Car2;

    public WaxOff2(Car2 c) {
        Car2 = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Car2.waitForWaxing();
                printnb("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                Car2.buffed();
            }
        } catch (InterruptedException e) {
            print("Exiting via interrupt");
        }
        print("Ending Wax Off task");
    }
}


public class WaxOMatic2 {
    public static void main(String[] args) throws Exception {
        Car2 Car2 = new Car2();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff2(Car2));
        exec.execute(new WaxOn22(Car2));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }
}
