package com.caolei.homework.day02;

public class Test4 {
    public static void main(String[] args) {
        /*
         * 原因:
         */
        String num = "123 ";
        Integer d = Integer.parseInt(num);
        System.out.println(d);

        /*
         * 原因:
         */
        num = "123.456";
        d = Integer.parseInt(num);
        System.out.println(num);

        /*
         * 原因:
         */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);


    }
}
