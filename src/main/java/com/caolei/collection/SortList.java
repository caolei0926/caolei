package com.caolei.collection;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        //创建List集合
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);//排序
        System.out.println(list);
    }
}
