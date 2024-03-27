package com.caolei.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./1.jpg");
        FileOutputStream fos = new FileOutputStream("./2.jpg");
        int b ;
        /*byte[] bytes = new byte[1024];
        while ((b = fis.read()) != -1){
            fos.write(bytes);
        }*/
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
