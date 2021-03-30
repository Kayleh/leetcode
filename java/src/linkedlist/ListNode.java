package linkedlist;

/**
 * @Author: Kayleh
 * @Date: 2021/4/4 1:59
 */
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
