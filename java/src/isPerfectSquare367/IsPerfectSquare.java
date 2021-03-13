package src.isPerfectSquare367;

/**
 * @Author: Wizard
 * @Date: 2020/6/16 21:16
 */
//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//说明：不要使用任何内置的库函数，如  sqrt。
//
//示例 1：
//
//输入：16
//输出：True
//
//示例 2：
//
//输入：14
//输出：False
public class IsPerfectSquare
{
    public static void main(String[] args)
    {
        System.out.println(isPerfectSquare(144));
    }

    public static boolean isPerfectSquare(int num)
    {
        int low = 1;
        int high = num;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            // int product = mid * mid;   越界
            int t = num / mid;
            if (t == mid)
            {
                if (num % mid == 0) return true;
                low = mid + 1;
            } else if (t < mid)
            {
                high = mid - 1;
            } else
            {
                low = mid + 1;
            }
        }

        return false;
    }
}
