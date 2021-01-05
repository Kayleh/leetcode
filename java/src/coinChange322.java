/**
 * @Author: Kayleh
 * @Date: 2021/3/17 1:13
 */
public class coinChange322
{
    public int coinChange(int[] coins, int amount)
    {

        int[] memo = new int[amount + 1];
        return dp(memo, amount, coins);
    }

    public static int dp(int[] memo, int amount, int[] coins)
    {

        if (amount == 0) return 0;
        if (amount < 0) return -1;
        if (memo[amount] != 0) return memo[amount];
        int res = Integer.MAX_VALUE;
        for (int coin : coins)
        {
            int subProblem = dp(memo, amount - coin, coins);
            if (subProblem == -1) continue;
            res = Math.min(res, subProblem + 1);
        }
        if (res != Integer.MAX_VALUE)
        {
            memo[amount] = res;
        } else
        {
            memo[amount] = -1;
        }
        return memo[amount];
    }
}
//    public int coinChange(int[] coins, int amount)
//    {
//
//        int[] memo = new int[amount + 1];
//        return dp(memo, amount, coins);
//    }
//
//    public static int dp(int[] memo, int amount, int[] coins)
//    {
//
//        if (amount == 0) return 0;
//        if (amount < 0) return -1;
//        if (memo[amount] != 0) return memo[amount];
//        int res = Integer.MAX_VALUE;
//        for (int coin : coins)
//        {
//            int subProblem = dp(memo, amount - coin, coins);
//            if (subProblem == -1) continue;
//            res = Math.min(res, subProblem + 1);
//        }
//        if (res != Integer.MAX_VALUE)
//        {
//            memo[amount] = res;
//        } else
//        {
//            memo[amount] = -1;
//        }
//        return memo[amount];
//    }
//}
