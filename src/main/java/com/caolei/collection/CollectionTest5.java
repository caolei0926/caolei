package com.caolei.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest5 {
    public static void main(String[] args) {
        //创建一个list集合并且用增强for循环遍历
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        for (String s : list) {
            System.out.println(s);
        }
        //传统for循环遍历
        System.out.println("=========================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //用迭代器遍历集合
        System.out.println("=========================");
        list.forEach(s -> System.out.println(s));
        System.out.println("=========================");
        list.forEach(System.out::println);

    }
}
