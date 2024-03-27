package com.caolei.io;

import java.io.*;

public class CopyTest3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("1.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream  fos = new FileOutputStream("3.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
