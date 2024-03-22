package com.caolei.string;

/**
 * 字符串拼接
 * 增删改插
 */
public class StringBuilder_Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        sb.insert(5,"java");
        sb.delete(5, 7);
        sb.replace(5, 7, "java");
        sb.reverse();//字符串反转
        System.out.println(sb);
    }
}
