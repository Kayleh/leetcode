package src.defangIPaddr1108;

/**
 * @Author: Wizard
 * @Date: 2020/6/17 21:22
 */
//给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
//
//所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
//
//示例 1：
//
//输入：address = "1.1.1.1"
//输出："1[.]1[.]1[.]1"

public class DefangIPaddr
{
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        String strings = defangIPaddr(address);
        System.out.println(strings);
    }

    public static String defangIPaddr(String address)
    {
        StringBuffer stringBuffer = new StringBuffer();
        String[] split = address.split("\\.");
        for (int i = 0; i < split.length; i++)
        {
            stringBuffer.append(split[i]);
            if (i == split.length - 1)
                break;
            stringBuffer.append("[.]");
        }
        return stringBuffer.toString();
    }
}
