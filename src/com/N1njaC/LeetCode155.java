package com.N1njaC;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by N1njaC on 2017/8/25.
 */
public class LeetCode155 {


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
    }

}

class MinStack {

    private Stack<Integer> integers = new Stack<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    //如果要push的值比现有的最小值要小，先将之前的最小值push进栈，为的是当出栈的时候值为最小值的时候，这时候
    //需要重新赋值最小值，而这种做法刚好利用出栈两次，第一次出栈栈顶元素，第二个出栈的值赋值给最小值。
    //这里最小值只能利用常数复杂度来获取（题目规定）
    public void push(int x) {

        if (x <= min) {
            integers.push(min);
            min = x;
        }
        integers.push(x);
    }

    public void pop() {
        if (integers.pop() == min) {
            min = integers.pop();
        }
    }

    public int top() {
        return integers.peek();
    }

    public int getMin() {

        return min;
    }

}
