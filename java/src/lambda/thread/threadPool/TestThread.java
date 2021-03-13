package src.lambda.thread.threadPool;

/**
 * @Author: Kayleh
 * @Date: 2020/11/21 0:29
 */
public class TestThread
{
    public static void main(String[] args)
    {
        ThreadPool threadPool = new ThreadPool();
        int sleep = 1000;
        while (true)
        {
            threadPool.add(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
            try
            {
                Thread.sleep(sleep);
                sleep = sleep > 100 ? sleep - 100 : sleep;
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
