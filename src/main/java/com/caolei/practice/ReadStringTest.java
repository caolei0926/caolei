package com.caolei.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/com/caolei/practice/ReadStringTest.java");
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];

        fis.read(bytes);
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);
        fis.close();
    }
}
