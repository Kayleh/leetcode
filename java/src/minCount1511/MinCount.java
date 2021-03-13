package src.minCount1511;

/**
 * @Author: Wizard
 * @Date: 2020/7/9 20:25
 * <p>
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * <p>
 * 示例 1：
 * 输入：[4,2,1]
 * 输出：4
 * <p>
 * 解释：第一堆力扣币最少需要拿 2 次，第二堆最少需要拿 1 次，第三堆最少需要拿 1 次，总共 4 次即可拿完。
 */
public class MinCount
{
    public static void main(String[] args)
    {
        int[] coins = {2, 3, 10};
        int i = new MinCount().minCount(coins);
        System.out.println(i);
    }

    public int minCount(int[] coins)
    {
        int min = 0;
        for (int coin : coins)
        {
//            if (coin <= 2) min += 1;
//            else
            min += coin / 2 + (coin % 2);
        }
        return min;
    }
}
