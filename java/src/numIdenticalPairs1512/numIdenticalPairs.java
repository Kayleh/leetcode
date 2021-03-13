package src.numIdenticalPairs1512;

//给你一个整数数组 nums 。
//如果一组数字(i,j)满足 nums[i]==nums[j]且 i<j ，就可以认为这是一组 好数对 。
//返回好数对的数目。

//输入：nums = [1,2,3,1,1,3]
//输出：4
//解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Kayleh
 * @Date: 2020/8/30 22:33
 */
public class numIdenticalPairs
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int i = numIdenticalPairs(nums);
        System.out.println(i);
    }

    //me
    public static int numIdenticalPairs(int[] nums)
    {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] == nums[j] && i < j)
                {
                    result += 1;
                }
            }
        }
        return result;
    }

    //answer
    public int numIdenticalPairs1(int[] nums)
    {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int num : nums)
        {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            int v = entry.getValue();
            ans += v * (v - 1) / 2;
        }
        return ans;
    }


}
