package com.caolei.string;

/**
 * 字符在字符串第一次出现的位置
 */
public class IndexOf {
    public static void main(String[] args) {
        String s1 = "123abc3453636哈哈哈哈你好卡拉离开了肯定是交罚款积分二五九开发十六分";
        System.out.println(s1.indexOf("哈"));
        System.out.println(s1.length());
        System.out.println(s1.indexOf("哈",20,30));

        System.out.println(s1.lastIndexOf("哈"));
    }
}
