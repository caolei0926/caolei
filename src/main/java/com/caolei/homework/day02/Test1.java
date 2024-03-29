package com.caolei.homework.day02;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入用户名:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        if (username.matches("^[a-zA-Z0-9_]{3,15}$")) {
            System.out.println("请输入年龄:");
            String age = scanner.nextLine();
            if (age.matches("^[0-9]{1,3}$")) {
                int ageInt = Integer.parseInt(age);
                if (ageInt >= 1 && ageInt <= 100) {
                    System.out.println("用户名和年龄都正确");
                } else {
                    System.out.println("年龄有误");
                }
            } else {
                System.out.println("年龄有误");
            }
        } else {
            System.out.println("用户名有误");
        }
    }
}
