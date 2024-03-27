package com.caolei.file;

import java.io.File;
import java.io.FileFilter;

public class ListFileTest2 {
    public static void main(String[] args) {
        //获取垫高点目录下所有名字以"."开头的文件
        File file = new File(".");
        FileFilter fileFilter = pathname -> pathname.getName().startsWith(".");

        File[] files = file.listFiles(fileFilter);
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
    }
}
