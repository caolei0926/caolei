package com.caolei.string;

/**
 * @author 曹磊
 */
public class String_SE {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";
        String s3 = new String("123abc");
        System.out.println(s1.equals(s3));
        System.out.println(s3 == s2);

    }
}
