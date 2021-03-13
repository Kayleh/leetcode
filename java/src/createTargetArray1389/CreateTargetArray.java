package src.createTargetArray1389;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Wizard
 * @Date: 2020/7/8 17:21
 * <p>
 * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * <p>
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * <p>
 * 题目保证数字插入位置总是存在。 
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * 输出：[0,4,1,3,2]
 * 解释：
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 */
public class CreateTargetArray
{
    public int[] createTargetArray(int[] nums, int[] index)
    {
        int num_length = nums.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < num_length; i++)
        {
            res.add(index[i], nums[i]);
        }
        int[] target = new int[num_length];
        for (int i = 0; i < num_length; i++)
        {
            target[i] = res.get(i);
        }
        return target;
    }

    public static void main(String[] args)
    {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        CreateTargetArray createTargetArray = new CreateTargetArray();
        int[] targetArray = createTargetArray.createTargetArray(nums, index);
        System.out.println(Arrays.toString(targetArray));
    }
}
