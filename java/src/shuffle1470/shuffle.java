package src.shuffle1470;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Wizard
 * @Date: 2020/6/15 18:05
 */
//给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
//
//请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
//
//
//示例 1：
//输入：nums = [2,5,1,3,4,7], n = 3
//输出：[2,3,5,4,1,7]
//解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
//
public class shuffle
{
    public static void main(String[] args)
    {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] ints = shuffle1(nums, 3);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] shuffle1(int[] nums, int n)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            list.add(nums[i]);
            list.add(nums[i + n]);
        }
        for (int i = 0; i < 2 * n; i++)
        {
            nums[i] = list.get(i);
        }
        return nums;
    }


}
