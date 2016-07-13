package com.github.hackerwin7.thinking.in.java.chapter.three.instance;

/**
 * Created by IntelliJ IDEA.
 * User: hackerwin7
 * Date: 2016/06/29
 * Time: 4:30 PM
 * Desc:
 * Tips:
 */
public class URShift {
    public static void main(String[] args) throws Exception {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        /* There is a problem, however,
        * with the unsigned right shift combined with assignment.
        * If you use it with byte or short, you don’t get the correct results.
        * */
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10; // >>>= or <<<= in the short or byte type cases, we can not get the correct result
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));

        int c = 8;
        System.out.println(c<<2);//8 * (2^2)
        System.out.println(c>>2);//8 / (2^2)

    }
}
