package com.caolei.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadTest1 {
    public static void main(String[] args) throws IOException {
        File  file = new File("./test.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("./test2.txt");
        int b;
        //创建时间戳
        long l = System.currentTimeMillis();
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        System.out.println(System.currentTimeMillis()-l);
        fis.close();
        fos.close();
    }
}
