package src.lambda.thread.Deadlock;

/**
 * @Author: Kayleh
 * @Date: 2020/11/20 21:27
 */
public class threeLock
{
    public static void main(String[] args)
    {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Thread t1 = new Thread()
        {
            public void run()
            {
                synchronized (object1)
                {
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    synchronized (object2)
                    {
                        synchronized (object3)
                        {
                        }
                    }
                }

            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized (object2)
                {
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    synchronized (object3)
                    {
                        synchronized (object2)
                        {
                        }
                    }
                }

            }
        };
        Thread t3 = new Thread()
        {
            public void run()
            {
                synchronized (object3)
                {
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    synchronized (object2)
                    {
                        synchronized (object1)
                        {
                        }
                    }
                }

            }
        };
        t1.start();
        t2.start();
        t3.start();

    }
}
