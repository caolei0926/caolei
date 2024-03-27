package com.caolei.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./1.jpg");
        FileOutputStream fos = new FileOutputStream("./3.jpg");
        byte[] bytes = new byte[1024*10];
        int b ;
        while ((b = fis.read()) != -1){
            fos.write(bytes,0,b);
        }
        fis.close();
        fos.close();
    }
}