package com.caolei.io;

import java.io.File;
import java.io.IOException;

public class IoTest {
    public static void main(String[] args) {
        //在当前目录下创建100个文件，名字为test1.txt~test100.txt
        for (int i = 1; i <= 100; i++) {
            File file = new File("test"+i+".txt");
            if (file.exists()) {
                System.out.println("文件已存在");
            }else {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
