package src.runningSum1479;

import java.util.Arrays;

/**
 * @Author: Wizard
 * @Date: 2020/6/22 15:53
 */
//给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
//
//请返回 nums 的动态和。
//
//输入：nums = [1,2,3,4]
//输出：[1,3,6,10]
//解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
public class RunningSum
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4};
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] runningSum2(int[] nums)
    {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static int[] runningSum(int[] nums)
    {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            if (i == 0)
            {
                result[0] = nums[0];
            } else
            {
                int add = 0;
                for (int j = i; j >= 0; j--)
                {
                    add = add + nums[j];
                }
                result[i] = add;
            }
        }
        return result;
    }
}
