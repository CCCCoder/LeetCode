package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/24.
 */
public class LeetCode141 {


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode runner = head;
        ListNode walker = head;

        while (runner.next!=null&&runner.next.next!=null){
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }
}
