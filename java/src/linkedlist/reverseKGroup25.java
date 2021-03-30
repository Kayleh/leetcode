package linkedlist;

/**
 * @Author: Kayleh
 * @Date: 2021/4/4 1:58
 */
public class reverseKGroup25
{
    //反转以a为头结点的链表
//    ListNode reverse(ListNode a)
//    {
//        ListNode pre = null, cur = a, next = a;
//        while (cur != null)
//        {
//            next = cur.next;//使 “next” 赋值为 “当前指针” 的 “下一个”
//            cur.next = pre; //使 “当前节点” 指向 “前驱节点”，（断开指向next的连接，而连接新建的前驱节点）
//            pre = cur;      //pre指针“前驱节点”移动到cur“当前位置”的位置
//            cur = next;     //当前位置更改为 下一个节点 的位置
//        }
//        //运行完成后 前驱节点就是反转后的头结点
//        //返回反转后的头结点
//        return pre;
//    }

    //  反转以 a 为头结点的链表」其实就是「反转 a 到 null 之间的结点」，那么如果让你「反转 a 到 b 之间的结点」
    //  只要更改函数签名，并把上面的代码中 null 改成 b 即可：
    ListNode reverse(ListNode a, ListNode b)
    {
        ListNode pre = null, cur = a, next = a;
        while (cur != b)
        {
            next = cur.next;//使 “next” 赋值为 “当前指针” 的 “下一个”
            cur.next = pre; //使 “当前节点” 指向 “前驱节点”，（断开指向next的连接，而连接新建的前驱节点）
            pre = cur;      //pre指针“前驱节点”移动到cur“当前位置”的位置
            cur = next;     //当前位置更改为 下一个节点 的位置
        }
        //运行完成后 前驱节点就是反转后的头结点
        //返回反转后的头结点
        return pre;
    }

    public ListNode reverseKGroup(ListNode head, int k)
    {
        ListNode a, b;
        a = b = head;
        for (int i = 0; i < k; i++)
        {
            // 越界,不足 k 个，不需要反转，base case
            if (b == null)
                return head;
            b = b.next;
        }
        ListNode reverse1 = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return reverse1;
    }
}
