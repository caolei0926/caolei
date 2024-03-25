package com.caolei.io;

import java.io.File;

public class ListFileTest {
    public static void main(String[] args) {
        //查看当前项目目录所有子项
        File file = new File(".");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
