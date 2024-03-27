package com.caolei.homework.day04;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String name = sc.nextLine();
        if (Objects.equals(name, "a.txt")) {
            File file = new File(name);
            file.exists();
            System.out.println("已创建成功");
        }else if (!(Objects.equals(name,"a.txt"))){
            System.out.println("文件已存在,或者输入错误！");
        }

    }
}
