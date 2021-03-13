package src.subtractProductAndSum1281;

/**
 * @Author: Wizard
 * @Date: 2020/6/22 16:26
 */
//给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
//
//示例 1：
//输入：n = 234
//输出：15
//解释：
//各位数之积 = 2 * 3 * 4 = 24
//各位数之和 = 2 + 3 + 4 = 9
//结果 = 24 - 9 = 15

public class SubtractProductAndSum
{
    public static void main(String[] args)
    {
        int n = 234;
        int i = subtractProductAndSum(n);
        System.out.println(i);
    }

    public static int subtractProductAndSum1(int n)
    {
        int ji = 1;
        int he = 0;
        while (n != 0)
        {
            ji *= n % 10;
            he += n % 10;
            n /= 10;
        }
        return ji - he;
    }


    public static int subtractProductAndSum(int n)
    {
        String s = n + "";
        int[] numbers = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            numbers[i] = s.charAt(i) - 48;
        }
        int multiply = 0;
        int add = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (i == 0)
            {
                multiply = numbers[0];
            } else
            {
                multiply *= numbers[i];
            }
            add += numbers[i];
        }

        return multiply - add;
    }

}
