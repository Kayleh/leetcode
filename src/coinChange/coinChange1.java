package coinChange;

/**
 * 先看下题目：给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，每种硬币的数量无限，再给一个总金额 amount，问你最少需要几枚硬币凑出这个金额，如果不可能凑出，算法返回 -1 。算法的函数签名如下：
 * <p>
 * // coins 中是可选硬币面值，amount 是目标金额
 * int coinChange(int[] coins, int amount);
 * 比如说 k = 3，面值分别为 1，2，5，总金额 amount = 11。那么最少需要 3 枚硬币凑出，即 11 = 5 + 5 + 1。
 * <p>
 * 你认为计算机应该如何解决这个问题？显然，就是把所有可能的凑硬币方法都穷举出来，然后找找看最少需要多少枚硬币。
 * <p>
 * 暴力递归
 *
 * @Author: Kayleh
 * @Date: 2021/3/16 2:02
 */
public class coinChange1
{
    public int coinChange(int[] coins, int amount)
    {
        //base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        //最小值
        int res = Integer.MIN_VALUE;
        for (int coin : coins)
        {
//            int subProblem = coinChange(coins, amount - coin);
//            if (subProblem == -1) continue;
            res = Math.min(res, coinChange(coins, amount - coin) + 1);
        }
        if (res != Integer.MIN_VALUE)
        {
            return res;
        } else return -1;
    }
}
