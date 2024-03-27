package com.caolei.file;

import java.io.File;

public class DeleteFileTest {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            File file = new File("test"+i+".txt");
            if (file.exists()) {
                file.delete();
            }else {
                System.out.println("没有该文件");
            }
        }
    }
}
