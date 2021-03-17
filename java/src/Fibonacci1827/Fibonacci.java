package src.Fibonacci10;

/**
 * @Author: Wizard
 * @Date: 2020/6/14 20:18
 */
//写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
//
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
//斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
//
//答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

public class Fibonacci
{
    public static void main(String[] args)
    {
        int fibonacci = fib(45);
        System.out.println(fibonacci);
    }

    //递归
    public static int fib1(int n)
    {
        if (n == 0)
        {
            return 0;
        } else if (n == 1)
        {
            return 1;
        } else
        {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    //非递归
    public static int fib(int n)
    {
        if (n == 0)
        {
            return 0;
        } else if (n == 1)
        {
            return 1;
        } else
        {
            int first = 0;
            int second = 1;
            for (int i = 0; i < n - 1; i++)
            {
                int result = first + second;
                first = second;
                second = result;
            }
            return second % 1000000007;
        }
    }
}
