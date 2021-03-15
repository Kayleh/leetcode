/**
 * 除数博弈
 *
 * @Author: Kayleh
 * @Date: 2021/3/15 1:40
 */
public class divisorGame1025
{
    public static boolean divisorGame(int N)
    {
        boolean[] dp = new boolean[N + 5];
        //base case
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= N; ++i)
        {
            for (int j = 1; j < i; ++j)
            {
                if ((i % j) == 0 && !dp[i - j])
                {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[N];
    }


    public static boolean divisorGame2(int N)
    {
        return N % 2 == 0;
    }

    public static void main(String[] args)
    {
        divisorGame(2);
    }
}
