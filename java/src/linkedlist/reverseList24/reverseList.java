package src.reverseList24;

/**
 * @Author: Wizard
 * @Date: 2020/6/14 11:19
 */

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 * 限制：
 * 0 <= 节点个数 <= 5000
 */
public class reverseList
{


    public static class ListNode
    {

        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }

    //迭代
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //递归
    //首先找到递归的出口
    //
    //就是找到链表最后一个节点（尾结点），我们要反转当前的链表，就必须从尾结点开始，
    // 因为链表的性质就是：通过头结点来找到后面的节点进行操作，CRUD都需要从头结点开始找。
    //
    //1，2，3，4，5
    public static ListNode reverseList1(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        //5的时候触发了终止条件，所以拿到的是4

        ListNode node = reverseList1(head.next);
        //到达链表的末尾 这时head=4， 下一个next 为 5
        // 第二次递归 head 就是3了 head在递减
        head.next.next = head;

        //这句话是防止循环指向，所以要断开
        head.next = null;
        return node;
    }


    public static void main(String[] args)
    {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next = new ListNode(4);

        ListNode listNode1 = reverseList1(listNode);

        System.out.println(listNode1);

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//}


