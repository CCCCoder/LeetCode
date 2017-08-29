package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/28.
 */
public class LeetCode160 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //假设a的长度比b短，那么在while循环中，当a.next为空的时候（也就是a到达尾部的时候），
    //b还没有到达尾部，此时，将b赋值给a，然后继续，此时的a在b链上继续走，而此时的b走完自身
    //的b链，将a赋值给b，然后继续；注意此时，b从a链上从头开始，而此时的a已经在b链上走了一段了
    // 此时从这里两者同时出发，而且长度相等，因为走过的这一段即 b比a长的长度。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : a.next;
        }
        return a;
    }

}
