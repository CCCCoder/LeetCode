package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/2.
 */
public class LeetCode083 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //将head赋给node来进行算法，head的next地址和node next的地址是一样的。所以后面node的变化也就是node的变化。
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        ListNode node = head;
        //这里，只要node的值和下一个的值相同的话，直接把node.next给替换成node.next.next，也就是说node.next给去除了。（这个节点消失了）
        //不同的话继续下一个开始判断
        while (node.next != null) {
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }


}




