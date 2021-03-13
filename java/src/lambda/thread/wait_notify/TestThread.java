package src.lambda.thread.wait_notify;

/**
 * 线程之间有交互通知的需求，考虑如下情况：
 * 有两个线程，处理同一个英雄。
 * 一个加血，一个减血。
 * <p>
 * 减血的线程，发现血量=1，就停止减血，直到加血的线程为英雄加了血，才可以继续减血
 *
 * @Author: Kayleh
 * @Date: 2020/11/20 21:49
 */
public class TestThread
{
    public static void main(String[] args)
    {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;

        Thread t1 = new Thread()
        {
            public void run()
            {
                gareen.hurt();

                try
                {
                    Thread.sleep(10);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        };
        t1.start();

        Thread t2 = new Thread()
        {
            public void run()
            {
                gareen.recover();

                try
                {
                    Thread.sleep(100);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        t2.start();
    }
}
