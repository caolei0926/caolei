package com.caolei.io;

import java.io.FileInputStream;
import java.io.IOException;

//文件输入流
public class FISTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test.txt");
        int read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println(read);
        fis.close();
    }
}
