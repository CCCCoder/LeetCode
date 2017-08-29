package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/29.
 */
public class LeetCode160_2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        int lengthA = computeLen(headA);
        int lengthB = computeLen(headB);

        while (lengthA > lengthB) {
            lengthA--;
        }
        while (lengthA < lengthB) {
            lengthB--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }

    public int computeLen(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }

        return length;
    }
}
