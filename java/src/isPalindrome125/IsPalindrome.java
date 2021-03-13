package src.isPalindrome125;

/**
 * @Author: Wizard
 * @Date: 2020/6/19 9:16
 */
//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//说明：本题中，我们将空字符串定义为有效的回文串。
//
//示例 1:
//
//输入: "A man, a plan, a canal: Panama"
//输出: true
public class IsPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s)
    {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch))
            {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }

    public boolean isPalindrome1(String s)
    {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right)
        {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                --right;
            }
            if (left < right)
            {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }


}
//        boolean result = false;
//        String str1 = s.replaceAll(" ", "");
//        String str2 = str1.replaceAll(",", "");
//        String trim = str2.replaceAll(":", "");
//        int start = 0;
//        int end = trim.length() - 1;
//        while (start != end) {
//            if ((trim.charAt(start) + "").equalsIgnoreCase((trim.charAt(end) + ""))) {
//                result = true;
//                if (start++ < end--) {
//                    start++;
//                } else {
//                    return result;
//                }
//                if (end-- > start++) {
//                    end--;
//                } else {
//                    return result;
//                }
//            } else {
//                result = false;
//                return result;
//            }
//        }
//        return result;
//    }


//        for (int i = 0; i < s.length(); i++) {
//            for (int j = s.length()-1; j >= 0; j--) {
//                if (i == j) {
//                    break;
//                }
//                if (s.charAt(i) == s.charAt(j)){
//
//                }
//
//            }
//        }


