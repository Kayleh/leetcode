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
        boolean[] f = new boolean[N + 5];

        f[1] = false;
        f[2] = true;
        for (int i = 3; i <= N; ++i)
        {
            for (int j = 1; j < i; ++j)
            {
                if ((i % j) == 0 && !f[i - j])
                {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[N];
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
