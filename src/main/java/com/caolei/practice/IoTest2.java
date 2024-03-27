package com.caolei.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IoTest2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请开始写入数据：");
        FileOutputStream  fos = new FileOutputStream(new File("./note.txt"));
        String str = scanner.nextLine();
        while (!str.equalsIgnoreCase("exit")){
            fos.write(str.getBytes());
            str = scanner.nextLine();
        }
        fos.close();
    }
}
