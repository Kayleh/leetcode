package src.isLongPressedName925;

/**
 * @Author: Wizard
 * @Date: 2020/6/14 20:51
 * <p>
 * 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * <p>
 * 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 * <p>
 * 示例 1：
 * 输入：name = "alex", typed = "aaleex"
 * 输出：true
 * 解释：'alex' 中的 'a' 和 'e' 被长按。
 */
public class isLongPressedName
{
    public static void main(String[] args)
    {
        String name = "alex";
        String typed = "aaleex";
        boolean b = IsLongPressedName(name, typed);
        System.out.println(b);
    }

    public static boolean IsLongPressedName(String name, String typed)
    {
        int len_name = name.length();
        int len_type = typed.length();
        if (len_name > len_type)
        {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < len_name && j < len_type)
        {
            if (name.charAt(i) == typed.charAt(j))
            {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1))
            {
                j++;
            } else
            {
                return false;
            }
        }
        while (j < len_type)
        { //type 有剩余
            if (typed.charAt(j) != typed.charAt(j - 1))
                return false;
            j++;
        }
        return i == len_name;
    }

    public static boolean isLongPressedName2(String name, String typed)
    {
        char[] char1 = name.toCharArray();
        char[] char2 = typed.toCharArray();

        int p1 = 0;
        int p2 = 0;
        while (p1 < char1.length && p2 < char2.length)
        {
            if (char1[p1] == char2[p2])
            {
                p1++;
            }
            p2++;
        }
        return p1 == char1.length;
    }


    //    public static boolean isLongPressedName(String name, String typed) {
//        int j = 0;
//        for(char c : name.toCharArray()) {
//            if(j == typed.length()) {
//                return false;
//            }
//
//            if(typed.charAt(j) != c) {
//                if(j == 0 || typed.charAt(j-1)!=typed.charAt(j) ) {
//                    return false;
//                }
//                char tmp = typed.charAt(j);
//                while(j < typed.length() && typed.charAt(j) == tmp) {
//                    j++;
//                }
//                if(j == typed.length() || typed.charAt(j) != c) {
//                    return false;
//                }
//            }
//            j ++;
//        }
//        while(j < typed.length() && typed.charAt(j-1)==typed.charAt(j)){
//            j++;
//        }
//        if(j<typed.length()) {
//            return false;
//        }else {
//            return true;
//        }
//    }
//
}