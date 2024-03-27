package com.caolei.homework.day05;

import java.io.*;
import java.util.Arrays;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 * */
public class Test3_1 {
    public static void main(String[] args) throws IOException {
        File file = null;
        File[] files = file.listFiles();
        file = new File("txt");

        System.out.println(Arrays.toString(files));

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("./txt1");

        for (File value : files)
            System.out.println(value.getName() + "_cp." + value.getName().substring(value.getName().length() - 3));

        fis.close();
        fos.close();


    }
}
