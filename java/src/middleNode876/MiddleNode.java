package src.middleNode876;

/**
 * @Author: Wizard
 * @Date: 2020/7/1 18:13
 * <p>
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * <p>
 * 如果有两个中间结点，则返回第二个中间结点。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL
 */
public class MiddleNode
{
    public ListNode middleNode2(ListNode head)
    {
        ListNode[] list = new ListNode[100];
        int i = 0;
        while (head != null)
        {
            list[i++] = head;
            head = head.next;
        }
        return list[i / 2];
    }

    //单指针
    public ListNode middleNode1(ListNode head)
    {
        int n = 0;
        ListNode cur = head;
        while (cur != null)
        {
            ++n;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while (k < n / 2)
        {
            ++k;
            cur = cur.next;
        }
        return cur;
    }

    //快慢指针
    public ListNode middleNode(ListNode head)
    {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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