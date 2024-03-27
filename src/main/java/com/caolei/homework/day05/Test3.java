package com.caolei.homework.day05;

import java.io.*;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File  file = new File("./");
        File [] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream  fos = new FileOutputStream
                (file + "_cp."+ Arrays.toString(files).substring(Arrays.toString(files).length()-3,Arrays.toString(files).length()+1));
        while (fis.read() != -1){
            fos.write(fis.read());
        }
        fis.close();
        fos.close();
    }
}
