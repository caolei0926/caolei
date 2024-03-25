package com.caolei.practice;

import java.util.ArrayList;
import java.util.List;
//从大到小输出
public class IntTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double random = Math.random()*100;
            list.add((int)random);
        }
        System.out.println(list);
        list.sort((o1, o2) -> o2-o1);
        System.out.println(list);
    }
}
