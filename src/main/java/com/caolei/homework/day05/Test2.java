package com.caolei.homework.day05;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File directory = new File("./");
        File[] files = directory.listFiles();
        //判断字符串是否包含某个字符
        if (files != null) {
            for (File file : files) {
                if (file.getName().contains("s")) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
