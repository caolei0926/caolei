package com.caolei.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader  isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int data;
        try {
            while ((data = isr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
