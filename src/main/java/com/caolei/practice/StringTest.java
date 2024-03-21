package com.caolei.practice;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "https://www.baidu.com.cn";
        String s2 = "www.tedu.cn";

        System.out.println(StringTest.getHostName(s1));
        System.out.println(StringTest.getHostName2(s2));
        System.out.println(StringTest.getHostName(s2));
        System.out.println(StringTest.getHostName2(s1));
        System.out.println(StringTest.getHostName3(s1));
    }
    public static int getHostName(String line){
        return line.indexOf(".");
    }
    public static String getHostName2(String line){
        return line.substring(line.indexOf(".") + 1, line.lastIndexOf("."));
    }

    public static String getHostName3(String line) {
        System.out.println("第一个点的位置：" +line.indexOf(".")+"第二个点的位置："+line.indexOf(".",line.indexOf(".")+1));
        return line.substring(line.indexOf(".")+1 , line.indexOf(".",line.indexOf(".")+1));

    }
}

