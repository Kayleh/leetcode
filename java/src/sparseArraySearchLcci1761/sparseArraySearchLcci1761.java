package src.sparseArraySearchLcci1761;

/**
 * @Author: Kayleh
 * @Date: 2020/9/30 9:18
 * <p>
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 * <p>
 * 示例1:
 * <p>
 * 输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 * 输出：-1
 * 说明: 不存在返回-1。
 * 示例2:
 * <p>
 * 输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 * 输出：4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sparse-array-search-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class sparseArraySearchLcci1761
{
    public static void main(String[] args)
    {
        String[] words = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        sparseArraySearchLcci1761 sparseArraySearchLcci1761 = new sparseArraySearchLcci1761();
        System.out.println(sparseArraySearchLcci1761.findString1(words, "ball"));

    }

//    public int findString(String[] words, String s)
//    {
//        for (int i = 0; i < words.length; i++)
//        {
//
//            if (s.equals(words[i]))
//            {
//                return i;
//            }
//
//        }
//        return -1;
//    }

    //递归
    public int findString1(String[] words, String s)
    {
        int left = 0, right = words.length;
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (words[mid].equals("") && !words[left].equals(s))
            {
                left++;
                continue;
            } else if (words[left].equals(s))
            {
                return left;
            }

            if (words[mid].equals(s))
            {
                return mid;
                //mid在s后面
            } else if (words[mid].compareTo(s) > 0)
            {
                right = mid;
                //mid在s前面
            } else if (words[mid].compareTo(s) < 0)
            {
                left = mid + 1;
            }
        }
        return -1;
    }


}
