#include "iostream"

using namespace std;


struct ListNode
{
    int val;
    ListNode *next;

    ListNode(int x) : val(x), next(NULL)
    {}
};

class Solution
{
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB)
    {
        if (headA == NULL || headB == NULL) return NULL;
        ListNode *pa = headA;
        ListNode *pb = headB;
        while (pa != pb)
        {
            if (pa != NULL)
                pa = pa->next;
            else
                pa = headB;
            if (pb != NULL)
                pb = pb->next;
            else
                pb = headA;
        }
        return pa;
    }
};
//链表A长度：A=a+c,
//链表B长度：B=b+c。(c代表相交后面的公共节点)
//若无相遇点则A+B=B+A，走过两轮后都停在NULL。
//假如有相遇点则a+c+b+c = b+c+a+c
//倒推：会在公共c点相遇
//如:
//pBpB 比 pApA 少经过 22 个结点，会先到达尾部。
//将 pBpB 重定向到 A 的头结点，pApA 重定向到 B 的头结点后，pBpB 要比 pApA 多走 2 个结点。
// 因此，它们会同时到达交点。

