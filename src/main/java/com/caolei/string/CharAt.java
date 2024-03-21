package com.caolei.string;

/**
 * 获取数字位置的字符
 */
public class CharAt {
    public static void main(String[] args) {
        String str = "3423987d4js4g44h45k343";
        System.out.println(str.charAt(10));
        //遍历
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
