package com.N1njaC;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by N1njaC on 2017/7/10.
 */
public class LeetCode020 {

    /* Valid Parentheses：
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public boolean isValid(String s) {

        Stack<Character> charactersStack = new Stack<>();
        for (Character c : s.toCharArray()) {

            //先将([{这三种类型的入栈，只要碰到不是这三种类型的时候，就从栈顶拿一个出来与下一个不是这三种类型的字符进行比较，按照题意
            //对称就算true，所以如果要满足题意，栈顶的元素必然和不是这三种类型的第一个字符相同才满足。不满足直接false。
            if ("([{".contains(String.valueOf(c))) {
                charactersStack.push(c);
            } else {
                //peek():取到栈顶元素，并不删除。pop():删除栈顶元素。
                if (!charactersStack.isEmpty() && is_Valid(charactersStack.peek(), c)) {
                    charactersStack.pop();
                } else {
                    return false;
                }
            }
        }
        return charactersStack.isEmpty();
    }

    private boolean is_Valid(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        LeetCode020 leetCode020 = new LeetCode020();
        System.out.println(leetCode020.isValid("["));
    }
}
