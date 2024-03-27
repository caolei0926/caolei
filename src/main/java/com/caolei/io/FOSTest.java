package com.caolei.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//文件输出流
public class FOSTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./fos.dat");
            fos.write(100);
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

        }
    }
}
