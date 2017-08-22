package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/19.
 */
public class LeetCode125 {

    public boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;
        int head = 0;
        int tail = s.length() - 1;
        char cHead, cTail;
        while (head < tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
