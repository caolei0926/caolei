package com.caolei.practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        for (char i = 'A'; i <= 'Z'; i++) {
            fos.write(i);
        }
        fos.close();
    }
}
