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
//        Fibonacci fibonacci = new Fibonacci();
//        int fib = fibonacci.fib(3);
//        System.out.println(fib);
    }

    //状态压缩
    public int fib(int n)
    {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;
        int first = 1;//dp[1]
        int second = 1;//dp[2]
        int curr = 0;
        for (int i = 3; i <= n; i++)
        {
            curr = first + second;
            first = second;
            second = curr;
        }
        return curr;
    }
//    //动态规划 dp数组
//    public int fib(int n)
//    {
//        if (n < 1) return 0;
//        if (n == 1 || n == 2) return 1;
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, 0);
//        dp[1] = dp[2] = 1;
//        for (int i = 3; i <= n; i++)
//        {
//            dp[i] = dp[i - 2] + dp[i - 1];
//        }
//        return dp[n];
//    }

//    //带备忘录的递归
//    public  int fib(int n)
//    {
//        if (n < 1) return 0;
//        int[] rem = new int[n + 1];
//        Arrays.fill(rem, 0);
//        return helper(rem, n);
//    }
//    public static int helper(int[] rem, int n)
//    {
//        // base case
//        if (n == 1 || n == 2) return 1;
//        if (rem[n] != 0) return rem[0];
//        return helper(rem, n-2)+helper(rem, n-1);
//    }

//    //递归
//    public static int fib1(int n)
//    {
//        if (n == 0)
//        {
//            return 0;
//        } else if (n == 1)
//        {
//            return 1;
//        } else
//        {
//            return fib1(n - 1) + fib1(n - 2);
//        }
//    }
//
//    //非递归
//    public static int fib(int n)
//    {
//        if (n == 0)
//        {
//            return 0;
//        } else if (n == 1)
//        {
//            return 1;
//        } else
//        {
//            int first = 0;
//            int second = 1;
//            for (int i = 0; i < n - 1; i++)
//            {
//                int result = first + second;
//                first = second;
//                second = result;
//            }
//            return second % 1000000007;
//        }
//    }
}
