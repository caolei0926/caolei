package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest4 {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add("#");
        c.add("#");
        c.add("#");
        c.add("#");
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c);
        //迭代器
        c.removeIf("#"::equals);
        System.out.println(c);
    }
}
