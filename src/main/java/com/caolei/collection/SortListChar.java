package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListChar {
    public static void main(String[] args) {
        List<String> c = new ArrayList<>();
        c.add("高圆圆啊");
        c.add("Tom");
        c.add("Jerry");
        c.add("Jack");
        c.add("韩梅梅");
        c.add("Rose");
        c.add("lilei");
        c.add("hanmeimei");
        c.add("Li");
        c.add("Lihua");
        c.add("曹磊");
        c.add("哈哈哈");
        System.out.println(c);
        //Collections.sort(c);
        //c.sort(Comparator.comparingInt(String::length));
        c.sort((o1, o2) -> o2.length() - o1.length());
        Collections.reverse(c);
        System.out.println(c);
    }
}
