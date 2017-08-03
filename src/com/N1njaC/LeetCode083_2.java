package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/3.
 */
public class LeetCode083_2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //解答2，递归！真心厉害阿。
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        //每次将结果赋给上一层的next,然后比较，如果相同，直接把这个head替换成 head的next就达到删除重复的值了。不同的话
        //就直接返回这个head，反正他的next也赋值好了。
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

}
