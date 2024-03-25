package com.caolei.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //获取3-7
        System.out.println(list.subList(3,8));
        //将子集每个元素扩大十倍并放回子集中
        list.subList(3, 8).replaceAll(e->e*10);
        System.out.println(list);
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
