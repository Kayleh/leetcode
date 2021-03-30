package linkedlist;

/**
 * @Author: Kayleh
 * @Date: 2021/4/4 19:09
 */
public class isPalindrome234
{
//        ListNode left;
//
//    public boolean isPalindrome(ListNode head)
//    {
//        left = head;
//        return traverse(head);
//    }
//
//    public boolean traverse(ListNode right)
//    {
//        if (right == null)
//            return true;
//        boolean res = traverse(right.next);
//
//        //后序遍历代码
//        res = res && (right.val == left.val);
//        left = left.next;
//        return res;
//    }

    public boolean isPalindrome(ListNode head)
    {
        //快慢指针
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow 指针现在指向链表中点
        //如果fast指针没有指向null，说明链表长度为奇数，slow还要再前进一步：
        if (fast != null)
            slow = slow.next;

        //  从slow开始反转后面的链表，现在就可以开始比较回文串了：
        ListNode left = head;
        ListNode right = reverse(slow);

        while (right != null)
        {
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;

    }

    ListNode reverse(ListNode head)
    {
        ListNode pre = null, cur = head;
        while (cur != null)
        {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
