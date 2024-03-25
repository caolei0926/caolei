package com.caolei.homework.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //生成0-100随机数并输出集合
            list.add((int) (Math.random() * 100));
        }
        //截取第三个到第六个元素
        list.subList(2, 6);
        System.out.println(list);
        Collections.reverse(list);
        //反转
        System.out.println(list);
    }
}
