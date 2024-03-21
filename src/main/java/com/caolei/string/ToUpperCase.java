package com.caolei.string;

import java.util.Scanner;

/**
 * ToUpperCase全转大写
 * ToLowerCase全转小写
 */
public class ToUpperCase {
    public static void main(String[] args) {
        String s1 = "FSSae123abcJaVA";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());


        String s2 = "FSSae";
        System.out.println("请输入验证码：FSSae");
        Scanner scanner = new Scanner(System.in);
        String s3 = scanner.nextLine();
        System.out.println(s2.toUpperCase().equals(s3.toUpperCase()));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
