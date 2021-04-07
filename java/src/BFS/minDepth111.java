package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Kayleh
 * @Date: 2021/4/8 0:53
 */
public class minDepth111
{
    int minDepth(TreeNode root)
    {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ///root本身就是一层，初始化为1
        int depth = 1;
        while (!q.isEmpty())
        {
            int round = q.size();
            ///将当前队列中的所有节点向四周扩散
            for (int i = 0; i < round; i++)
            {
                TreeNode cur = q.poll();
                //判断是否达到终点
                if (cur.left == null && cur.right == null) return depth;
                //将cur的相邻节点加入队列
                if (cur.left != null)
                    q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            depth++;
        }
        return depth;
    }

}

class TreeNode
{
    int val;
    tree.TreeNode left;
    tree.TreeNode right;

    TreeNode()
    {
    }

    TreeNode(int val)
    {
        this.val = val;
    }

    TreeNode(int val, tree.TreeNode left, tree.TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
