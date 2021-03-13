package src.lambda.thread.ThreadPoolExecutor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Kayleh
 * @Date: 2020/11/21 0:41
 */
public class threadPoolExecutor
{
    public static void main(String[] args)
    {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());

        threadPool.execute(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("任务1");
            }
        });
    }
}
