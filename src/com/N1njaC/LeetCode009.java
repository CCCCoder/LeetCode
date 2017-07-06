package com.N1njaC;

/**
 * Created by N1njaC on 2017/7/5.
 */
public class LeetCode009 {

    //判断一个int类型的是不是回文数。只要利用反转int数，然后判断一下就行了。反转之后的数可能会溢出，所以结果还是采用long类型
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        //12321
        long result = 0;
        int tmp = x;
        while (tmp != 0) {
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if (x == result) return true;
        return false;
    }

    public static void main(String[] args) {
        LeetCode009 leetCode009 = new LeetCode009();
        System.out.println(leetCode009.isPalindrome(12321));
    }
}
