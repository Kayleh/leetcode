package tree;

/**
 * @Author: Kayleh
 * @Date: 2021/4/5 14:43
 */
public class invertTree226
{
    public TreeNode invertTree(TreeNode root)
    {
        //base case
        if (root == null)
            return null;

        //前序遍历位置
        //root结点需要交换它的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}



