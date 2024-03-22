package com.caolei.string;

/**
 * 静态方法，将其他类型转换成字符串
 */
public class ValueOf {
    public static void main(String[] args) {
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(true));
        //System.out.println(String.valueOf(null));
        System.out.println(String.valueOf(new Object()));
        System.out.println(String.valueOf(new String("123")));
        System.out.println(String.valueOf("123"));
    }
}
