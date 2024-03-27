package com.caolei.homework.day05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("./txt");
        String[] list = file.list();
        if (list != null) {
            for (String s : list) {
                FileOutputStream fos = new FileOutputStream("./txt/" + s.substring(0, s.length() - 3) + "_cp." + s.substring(s.length() - 3));
                fos.write(Arrays.toString(list).getBytes());
            }
        }
    }
}
