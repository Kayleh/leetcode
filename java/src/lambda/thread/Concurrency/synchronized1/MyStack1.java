//package src.lambda.thread.Concurrency.synchronized1;
//
//import src.lambda.thread.test.Hero;
//
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//
//
//public class MyStack implements Stack
//{
//
//    //把LinkedList通过 Collections.synchronizedList转换成了一个线程安全的List
//    List<Hero> heros = (List<Hero>) Collections.synchronizedList(new LinkedList<Hero>());
//
//    //不需要在push上加synchronized修饰符
//    //虽然多个线程可以同时进入push方法，但是调用heros.add方法的时候
//    //同一时间，只有一个线程可以进入
//    public void push(Hero h)
//    {
//        heros.add(h);
//    }
//
//    public Hero pull()
//    {
//        return heros.remove(heros.size() - 1);
//    }
//
//    public Hero peek()
//    {
//        return heros.get(heros.size() - 1);
//    }
//}