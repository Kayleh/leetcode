package src.lambda.design;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Kayleh
 * @Date: 2020/12/15 22:30
 */
public class singleton
{
    public static void main(String[] args)
    {

    }

    public static ExecutorService newCachedThreadPool()
    {
        return new ThreadPoolExecutor
                (0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    }
}

//
////饿汉式  静态变量
//class Singleton
//{
//
//    private static volatile Singleton instance;
//
//    private Singleton()
//    {
//
//    }
//
//
//    private static Singleton getInstance()
//    {
//        if (instance == null)
//        {
//            synchronized (Singleton.class)
//            {
//                if (instance == null)
//                {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}
