package src.lambda.thread.wait_notify.Producer_Consumer;

/**
 * 1. 使用栈来存放数据
 * 1.1 把栈改造为支持线程安全
 * 1.2 把栈的边界操作进行处理，当栈里的数据是0的时候，访问pull的线程就会等待。 当栈里的数据是200的时候，访问push的线程就会等待
 * 2. 提供一个生产者（Producer）线程类，生产随机大写字符压入到堆栈
 * 3. 提供一个消费者（Consumer）线程类，从堆栈中弹出字符并打印到控制台
 * 4. 提供一个测试类，使两个生产者和三个消费者线程同时运行，结果类似如下 ：
 *
 * @Author: Kayleh
 * @Date: 2020/11/20 23:29
 */
public class TestThread
{
    public static void main(String[] args)
    {
        MyStack<Character> stack = new MyStack<>();
        new ProducerThread(stack, "Producer1").start();
        new ProducerThread(stack, "Producer2").start();
        new ConsumerThread(stack, "Consumer1").start();
        new ConsumerThread(stack, "Consumer2").start();
        new ConsumerThread(stack, "Consumer3").start();
    }
}
