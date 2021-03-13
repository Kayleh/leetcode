package src.findNumbers1295;

/**
 * @Author: Wizard
 * @Date: 2020/6/30 17:45
 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * <p>
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * <p>
 * 解释：
 * 12 是 2 位数字（位数为偶数） 
 * 345 是 3 位数字（位数为奇数）  
 * 2 是 1 位数字（位数为奇数） 
 * 6 是 1 位数字 位数为奇数） 
 * 7896 是 4 位数字（位数为偶数）  
 * 因此只有 12 和 7896 是位数为偶数的数字
 */
//class Solution {
//    public int findNumbers(int[] nums) {
//        int res=0;
//        for(int i:nums){
//            if(String.valueOf(i).length()%2==0){
//                res++;
//            }
//        }
//
//        return res;
//    }
//}

public class FindNumbers
{
    public static void main(String[] args)
    {
        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums1 = {555, 901, 482, 1771};
        int numbers = findNumbers(nums1);
        System.out.println(numbers);
    }

    public static int findNumbers(int[] nums)
    {
        int count = 0;//记录位数为偶数的数字的个数

        for (int i = 0; i < nums.length; i++)
        {//遍历数组中的每一位
            int digits = 0;//位数
            String num = nums[i] + "";//每一个整数
            for (int j = 0; j < num.length(); j++)
            {//遍历数字的位数
                digits++;//???   num.length
            }
            if (digits % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}
