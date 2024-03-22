package com.caolei.string;

import java.util.Scanner;

/**
 * 正则表达式
 */
public class Regular {
    public static void main(String[] args) {
        //提示用户键盘输入邮箱，判断是否合法
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String regex = "^\\w+@\\w+(\\.\\w+)+$";
        System.out.println(email.matches(regex));
        
    }
}
