package com.caolei.file;

import java.io.File;

public class CreateNewFileTest {
    public static void main(String[] args) {
        //在当前项目目录下新建一个空白文件test2.txt
        File file = new File("./test3.txt");
        if (file.exists()) {
            System.out.println("该文件已存在");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
