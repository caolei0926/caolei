package com.caolei.string;

/**
 * 字符串拼接（线程安全的）
 */
public class StringBuffer_Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        sb.append("java");
        sb.append("python");
        sb.append("php");
        sb.append("c++");
        sb.append("c#");
        sb.append("c");
        sb.append("go");
        sb.append("ruby");
        sb.append("perl");
        sb.reverse() ;
        sb.delete(0,5);
        sb.insert(0, "hello");
        sb.replace(0, 5, "hello");

        System.out.println(sb);
    }
}
