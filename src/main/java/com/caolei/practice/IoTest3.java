package com.caolei.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IoTest3 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner  scanner = new Scanner(System.in);
        System.out.println("请输入文本：");
        String str = scanner.nextLine();

        FileOutputStream fos = new FileOutputStream("note.txt");
        OutputStreamWriter  osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        PrintWriter pw = new PrintWriter(osw,true);

        while (!str.equals("exit")) {
            pw.println(str);
            pw.flush();
            str = scanner.nextLine();
        }
        pw.close();
        System.out.println("退出系统");
    }
}
