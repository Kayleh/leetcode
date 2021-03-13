package src.game01;

/**
 * @Author: Wizard
 * @Date: 2020/6/17 20:37
 */
//小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
//
//输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
//
//示例 1：
//
//输入：guess = [1,2,3], answer = [1,2,3]
//输出：3
//解释：小A 每次都猜对了。

public class Game
{
    public static void main(String[] args)
    {
//
//        String game = game();
//        System.out.println(game);
    }


    public static int game(int[] guess, int[] answer)
    {

//        Random random = new Random();
//        for (int i = 0; i < 3; i++) {
//            //答案
//            answer[i] = random.nextInt(3)+1;
//            //猜
//            guess[i] = random.nextInt(3)+1;
//        }

        int counts = 0;
        for (int i = 0; i < 3; i++)
        {
            if (answer[i] == guess[i])
            {
                counts++;
            }
        }

        return counts;
    }
}
