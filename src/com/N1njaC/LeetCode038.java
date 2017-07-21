package com.N1njaC;


/**
 * Created by N1njaC on 2017/7/21.
 */
public class LeetCode038 {

    public String countAndSay(int n) {

        String lastString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lastString.length(); i++) {
                int count = 1;
                while (lastString.length() > (i + 1) && lastString.charAt(i) == lastString.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count)).append(String.valueOf(lastString.charAt(i)));
            }
            lastString = sb.toString();
        }
        return lastString;
    }

    public static void main(String[] args) {

        System.out.println(new LeetCode038().countAndSay(6));

    }
}
