package tree;

/**
 * @Author: Kayleh
 * @Date: 2021/4/5 15:27
 */


public class connect116
{
    public Node connect(Node root)
    {
        if (root == null) return null;
        connectTwoNode(root.left, root.right);
        return root;
    }

    void connectTwoNode(Node node1, Node node2)
    {
        if (node1 == null || node2 == null) return;
        //前序遍历位置//
        //将传入的两个结点连接
        node1.next = node2;

        // 连接相同父节点的两个子节点
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        // 连接跨越父节点的两个子节点
        connectTwoNode(node1.right, node2.left);
    }
}

class Node
{
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node()
    {
    }

    public Node(int _val)
    {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next)
    {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};