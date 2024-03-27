package com.caolei.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter  pw = new PrintWriter("pw.txt");
        pw.println("我曾难自拔于世界之大，也沉溺与青春梦话");
        pw.println(123);
        pw.close();
    }
}
