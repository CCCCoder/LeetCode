package com.N1njaC;


/**
 * Created by N1njaC on 2017/7/4.
 */
public class LeetCode007 {

    /*
    question:
    Reverse digits of an integer.
     Example1: x = 123, return 321
     Example2: x = -123, return -321
     */

    //32-bit integer :- 2^31 <= n < 2^31
    public int reverse(int x) {
        //注意result参数必须用long类型，原因是可能反转过来的字符串已经超过2^31次方了。
        //long类型转int为向下转型，可能有溢出情况，结果是不可预知的。
        long result = 0;
         int tmp = x;
        while (tmp != 0) {
            // 余数%每次取得就是数字的最后一位。
            //而除/是每次剔除数字的最后一位，刚好余数将最后一位取出来了，然后利用除来剔除它，直到只有一位数。
            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        LeetCode007 leetCode007 = new LeetCode007();
        System.out.println(leetCode007.reverse(-1243));
    }
}
