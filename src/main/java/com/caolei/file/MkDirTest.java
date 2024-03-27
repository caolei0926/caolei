package com.caolei.file;

import java.io.File;

public class MkDirTest {
    public static void main(String[] args) {
        File file = new File("D:\\User\\Projects\\IdeaProjects\\JAVA_SE\\a");
//        file.mkdir();//创建文件
//        file.deleteOnExit();//删除文件
        //file.mkdirs();//创建多级目录
        System.out.println(file.delete());
    }
}
