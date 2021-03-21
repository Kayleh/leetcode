package permute46;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Kayleh
 * @Date: 2021/3/20 21:15
 */
public class permute
{
    List<List<Integer>> res = new LinkedList<>();

    //输入一组不重复的数字，返回它们的全排列
    public List<List<Integer>> permute(int[] nums)
    {
        //路径
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track)
    {
        //结束条件，完成一组路径
        if (track.size() == nums.length)
        {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++)
        {
            //排除不合法的选择
            if (track.contains(nums[i]))
                continue;
            //做出选择
            track.add(nums[i]);
            //进入下一层决策树
            backtrack(nums, track);
            //取消选择
            track.removeLast();
        }
    }
}
