package com.caolei.io;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            File file = new File(String.valueOf(i));
            file.delete();
        }
    }
}
