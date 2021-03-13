package src.lambda.thread.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Kayleh
 * @Date: 2020/11/25 23:45
 */
public class TestThread
{
    public static void main(String[] args)
    {
        AtomicInteger atomicInteger = new AtomicInteger();
        int i = atomicInteger.decrementAndGet();
        int j = atomicInteger.incrementAndGet();
        int k = atomicInteger.addAndGet(3);
    }
}
