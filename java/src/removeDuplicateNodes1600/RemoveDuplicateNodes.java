package src.removeDuplicateNodes1600;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Wizard
 * @Date: 2020/7/1 17:37
 * <p>
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 */
public class RemoveDuplicateNodes
{
    public ListNode removeDuplicateNodes(ListNode head)
    {
        if (head == null)
        {
            return head;
        }
        //已经出现的集合
        Set<Integer> occurred = new HashSet<Integer>();
        occurred.add(head.val);
        ListNode pos = head;
        // 枚举前驱节点
        while (pos.next != null)
        {
            // 当前待删除节点
            ListNode cur = pos.next;
            if (occurred.add(cur.val))
            {
                pos = pos.next;
            } else
            {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }

}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}