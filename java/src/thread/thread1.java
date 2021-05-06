package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Kayleh
 * @Date: 2021/5/6 11:36
 */
public class thread1
{
    class Foo
    {

        AtomicInteger firstJobDone = new AtomicInteger();
        AtomicInteger secondJobDone = new AtomicInteger();

        public Foo()
        {

        }

        public void first(Runnable printFirst) throws InterruptedException
        {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstJobDone.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException
        {

            while (firstJobDone.get() != 1)
            {
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException
        {
            while (secondJobDone.get() != 1)
            {
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

    //--------------------------------------------------------------------
    class foo2
    {
        private boolean firstFinished;
        private boolean secondFinished;
        private Object lock = new Object();


        public void first(Runnable printFirst) throws InterruptedException
        {
            synchronized (lock)
            {
                printFirst.run();
                firstFinished = true;
                lock.notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException
        {
            synchronized (lock)
            {
                while (firstFinished == false)
                {
                    lock.wait();
                }
                printSecond.run();
                secondFinished = true;
                lock.notifyAll();
            }
        }

        public void third(Runnable printThird) throws InterruptedException
        {
            synchronized (lock)
            {
                while (secondFinished == false)
                {
                    lock.wait();
                }
                printThird.run();
            }
        }
    }


}
//----------------------------------------------------------------------
