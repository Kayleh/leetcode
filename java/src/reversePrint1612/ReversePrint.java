package src.reversePrint1612;

import java.util.Arrays;

/**
 * @Author: Wizard
 * @Date: 2020/6/18 9:56
 */
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//
//示例 1：
//
//输入：head = [1,3,2]
//输出：[2,3,1]
public class ReversePrint
{
    public static void main(String[] args)
    {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        int[] ints = reversePrint(listNode);
        System.out.println(Arrays.toString(ints));
    }

    public static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }


    public static int[] reversePrint(ListNode head)
    {
        ListNode node = head;
        int count = 0;
        while (node != null)
        {
            ++count;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        //从数组的后端开始插入
        for (int i = count - 1; i >= 0; --i)
        {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }

}
