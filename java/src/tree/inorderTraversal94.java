package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Kayleh
 * @Date: 2021/5/12 16:53
 */
public class inorderTraversal94
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        TreeNode head = root;
        if (head == null) return list;
        list.add(head.val);
        if (head.left != null) inorderTraversal(head.left);
        return list;
    }
}
