package tree;

/**
 * @Description:
 * @Author: Kayleh
 * @Date: 2021/7/17 13:38
 * @Version: 1.0
 */
public class buildTree106 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preStart, int preEnd,
                          int[] inorder, int inStart, int inEnd) {
        return null;
    }
}
