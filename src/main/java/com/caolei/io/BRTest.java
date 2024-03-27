package com.caolei.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/com/caolei/io/Person.java");
        InputStreamReader  isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader  br = new BufferedReader(isr,2);
        System.out.println(br);
        while (br.readLine() != null){
            System.out.println(br.readLine());
        }
    }
}
