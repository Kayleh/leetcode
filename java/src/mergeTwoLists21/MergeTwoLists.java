package src.mergeTwoLists21;

/**
 * @Author: Wizard
 * @Date: 2020/7/2 11:49
 * <p>
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null)
        {
            return l2;
        } else if (l2 == null)
        {
            return l1;
        } else if (l2.val > l1.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}

class ListNode
{
    int val;
    ListNode next;

    ListNode()
    {
    }

    ListNode(int val)
    {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}