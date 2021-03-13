package src.numJewelsInStones771;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Wizard
 * @Date: 2020/7/7 21:32
 * <p>
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 */
public class NumJewelsInStones
{


    public int numJewelsInStones1(String J, String S)
    {
        Set<Character> Jset = new HashSet();
        for (char j : J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s : S.toCharArray())
            if (Jset.contains(s))
                ans++;
        return ans;
    }


    public int numJewelsInStones(String J, String S)
    {
        int baoshi = 0;
        for (int i = 0; i < J.length(); i++)
        {
            for (int j = 0; j < S.length(); j++)
            {
                if (S.charAt(j) == J.charAt(i))
                {
                    baoshi++;
                }
            }
        }
        return baoshi;
    }

    public static void main(String[] args)
    {
        String J = "aA";
        String S = "aAAbbbb";
        NumJewelsInStones numJewelsInStones = new NumJewelsInStones();
        int i = numJewelsInStones.numJewelsInStones(J, S);
        System.out.println(i);
    }
}
