package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.get(3));

        for (String s : list) {
            System.out.print(s);
        }
        System.out.println(list.set(3, "g"));//返回值是被替换的元素

        System.out.println(list);
        //集合元素反转
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}
