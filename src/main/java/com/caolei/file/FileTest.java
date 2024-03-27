package com.caolei.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("./test1.txt");
        System.out.println("文件名字："+file.getName());//输出文件名字
        System.out.println("字节长度："+file.length());//输出占用字节
        System.out.println("文件路径："+file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isHidden());//看是不是一个被隐藏的文件
        System.out.println(file.isDirectory());
        System.out.println(file.lastModified());
        try {
            System.out.println(file.getCanonicalPath());//绝对路径
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
