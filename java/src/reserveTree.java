public class reserveTree
{
    public static void main(String[] args)
    {

    }

    public class TreeNode
    {
        TreeNode left;
        TreeNode right;
        TreeNode root;

    }

    public TreeNode invertTree(TreeNode root)
    {
        if (root == null)
        {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}