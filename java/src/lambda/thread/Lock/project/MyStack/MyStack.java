package src.lambda.thread.Lock.project.MyStack;

import src.lambda.Hero;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Kayleh
 * @Date: 2020/11/25 22:12
 */
public class MyStack
{
    LinkedList<Hero> heros = new LinkedList<Hero>();
    Lock lock = new ReentrantLock();

    public void push(Hero h)
    {
        try
        {
            lock.lock();
            heros.addLast(h);
        } finally
        {
            lock.unlock();
        }
    }

    public void pull()
    {
        try
        {
            lock.lock();
            heros.removeFirst();
        } finally
        {
            lock.unlock();
        }
    }

    public void peek()
    {
        try
        {
            lock.lock();
            heros.getLast();
        } finally
        {
            lock.unlock();
        }
    }

    public static void main(String[] args)
    {

    }
}
