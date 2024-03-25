package com.caolei.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add(1,"g");
        System.out.println(list);
        System.out.println(list.remove(4));//删除指定位置元素
        System.out.println(list);
    }
}
