package com.caolei.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
* 转换输出流
* */
public class OSWTest {
    public static void main(String[] args) {
        String str = "我曾经跨过山和大海，也穿过人山人海";
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), StandardCharsets.UTF_8);
            osw.write(str);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
