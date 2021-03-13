package src.reverseWords557;

/**
 * @Author: Wizard
 * @Date: 2020/6/30 20:01
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords
{
    public static void main(String[] args)
    {

    }

    public class Solution
    {
        public String reverseWords(String s)
        {
            String words[] = s.split(" ");
            StringBuilder res = new StringBuilder();
            for (String word : words)
                res.append(new StringBuffer(word).reverse().toString() + " ");
            return res.toString().trim();
        }
    }

}
