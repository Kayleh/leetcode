package src.lambda.thread.Concurrency.synchronized1;

import src.lambda.thread.test.Hero;

import java.util.LinkedList;
import java.util.Stack;


//public class MyStack implements Stack
//{
//
//    LinkedList<Hero> heros = new LinkedList<Hero>();
//
//    //插入的时候，加上synchronized，同步对象是当前实例
//    public synchronized void push(Hero h)
//    {
//        heros.addLast(h);
//    }
//
//    //取出的时候，加上synchronized，同步对象是当前实例
//    public synchronized Hero pull()
//    {
//        return heros.removeLast();
//    }
//
//    //查看没必要加上synchronized，因为不修改数据
//    public Hero peek()
//    {
//        return heros.getLast();
//    }
//
//}