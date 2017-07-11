package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/11.
 */
public class LeetCode021 {

    /*Merge Two Sorted Lists
    Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing together the nodes of the first two lists.
     */

    //主要的解体思想就是利用第三个节点，依次判断节点大小，注意是节点，节点包括值和指向下一个的指针！
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode lastNode = dummy;

        while (l1.next != null && l2.next != null) {

            if (l1.val < l2.val) {
                lastNode.next = l1;
                l1 = l1.next;
            } else {
                lastNode.next = l2;
                l2 = l2.next;
            }

            lastNode = lastNode.next;
        }

        //这里，当其中较短的那个为空的时候，直接把长的此节点直接赋给 lastNode.next，刚好后面所有的信息就接在后面。
        if (l1.next != null) {
            lastNode.next = l1;
        } else {
            lastNode.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
