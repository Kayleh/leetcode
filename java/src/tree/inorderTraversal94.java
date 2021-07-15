package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Kayleh
 * @Date: 2021/5/12 16:53
 */
public class inorderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
