package com.caolei.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlushTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("flush.txt");
        BufferedOutputStream  bos = new BufferedOutputStream(fos);
        String str = "hello world";
        byte[] bytes = str.getBytes();
        bos.write(bytes);
        //bos.flush();
        bos.close();
    }
}
