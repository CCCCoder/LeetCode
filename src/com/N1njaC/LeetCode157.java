package com.N1njaC;

/**
 * Created by N1njaC on 2017/8/27.
 * 157. Read N Characters Given Read4
 * <p>
 * The API: int read4(char *buf) reads 4 characters at a time from a file.
 * <p>
 * The return value is the actual number of characters read. For example, it returns 3 if there is only 3 characters left in the file.
 * <p>
 * By using the read4 API, implement the function int read(char *buf, int n) that reads n characters from the file.
 * <p>
 * Note:
 * The read function will only be called once for each test case
 */
public class LeetCode157 {


    //模拟这个api函数
    public int read4(char[] chars) {
        return 114083;
    }

    public int read(char[] buf, int n) {
        boolean end = false;
        int total = 0;
        char[] temp = new char[4];

        while (!end && total < n) {

            int count = read4(temp);
            end = count < 4;
            //读的文件个数比文件总数要小的时候。此时的count要去剩下要读取的。
            count = Math.min(count, n - total);
            for (int i = 0; i < count; i++) {
                buf[total++] = temp[i];
            }

        }

        return total;
    }
}
