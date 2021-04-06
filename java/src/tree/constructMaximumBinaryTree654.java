package tree;

/**
 * @Author: Kayleh
 * @Date: 2021/4/6 13:27
 */
public class constructMaximumBinaryTree654
{
    TreeNode constructMaximumBinaryTree(int[] nums)
    {
        return build(nums, 0, nums.length - 1);
    }

    /* 将 nums[low..high] 构造成符合条件的树，返回根节点 */
    TreeNode build(int[] nums, int low, int high)
    {
        //base case
        if (low > high) return null;

        //找出数组中的最大值和对应的索引
        int index = -1, maxVal = Integer.MIN_VALUE;
        for (int i = low; i <= high; i++)
        {
            if (maxVal < nums[i])
            {
                index = i;
                maxVal = nums[i];
            }

        }
        TreeNode root = new TreeNode(maxVal);
        //递归调用构造左右子树
        root.left = build(nums, low, index - 1);
        root.right = build(nums, index + 1, high);

        return root;
    }

}
