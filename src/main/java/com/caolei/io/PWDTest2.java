package com.caolei.io;

import java.io.*;

public class PWDTest2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter  osw = new OutputStreamWriter(fos);
        BufferedWriter  bw = new BufferedWriter(osw);
        bw.write("hello");
        PrintWriter  pw = new PrintWriter(bw);
        pw.println("world");
        pw.println(123);
        pw.println(true);
        pw.close();
    }
}
