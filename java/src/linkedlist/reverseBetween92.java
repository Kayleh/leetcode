package linkedlist;

/**
 * @Author: Kayleh
 * @Date: 2021/4/1 1:46
 */
public class reverseBetween92
{

    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        if (m == 1)
        {
            return reverseTopN(head, n);
        }

        ListNode between = reverseBetween(head.next, m - 1, n - 1);
        head.next = between;
        return head;
    }

    ListNode topNSuccessor = null;

    private ListNode reverseTopN(ListNode head, int n)
    {
        if (n == 1)
        {
            topNSuccessor = head.next;
            return head;
        }

        ListNode newHead = reverseTopN(head.next, n - 1);
        head.next.next = head;
        head.next = topNSuccessor;
        return newHead;
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
