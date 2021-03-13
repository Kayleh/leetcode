package src.reverseLeftWords58;

/**
 * @Author: Wizard
 * @Date: 2020/6/15 11:44
 */
//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
// 比如，输入字符串"abcdefg"和数字2，
// 该函数将返回左旋转两位得到的结果"cdefgab"。
//
//示例 1：
//
//输入: s = "abcdefg", k = 2
//输出: "cdefgab"
public class reverseLeftWords
{
    public static void main(String[] args)
    {
        String result = reverseLeftWords1("abcdefg", 2);
        System.out.println(result);
    }

    public static String reverseLeftWords1(String string, int number)
    {

        String preString = string.substring(0, number);
        String endString = string.substring(number);
        return endString + preString;


//        char[] chars = string.toCharArray();
//        ArrayList<Object> arrayList = new ArrayList<>();
//        for (int i = 0; i < chars.length-1; i++) {
//            arrayList.add(chars[i]);
//        }
//
//        StringBuffer preStringBuffer = new StringBuffer();
//        for (int i = 0; i < number; i++) {
//            arrayList.remove(arrayList.get(i));
//            preStringBuffer.append(chars[i]);
//        }
//        StringBuffer resultStringBuffer = new StringBuffer();
//        for (int i = 0; i <arrayList.size(); i++) {
//            resultStringBuffer.append(arrayList.get(i));
//        }
//
//        return  resultStringBuffer+""+preStringBuffer+"";
    }
}

