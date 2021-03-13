package src.Bitoperation;

/**
 * @Author: Wizard
 * @Date: 2020/7/5 21:16
 * <p>
 * 不用乘法符号(*) 计算 2x16
 */
public class Bitoperation
{

    public static void main(String[] args)
    {

        int i = 2;
        int j = 2 * 16; //使用乘法
        System.out.println("j=2*16:\t" + j);
        int k = 2 << 4;
        //     1    100000         num = 2^n-1 (n:多少个1)
        //          111111-11111   63 - 31= 32
        System.out.println("k=2<<4:\t" + k);


        int l = 2 << 5;   //2^移动的位数 = 乘多少
        System.out.println(l);
    }

}
