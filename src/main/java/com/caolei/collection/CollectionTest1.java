package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(123);
        collection.add(123);
        collection.add(123);
        collection.add(123);
        collection.add(123);
        collection.add(123);
        System.out.println(collection);
        System.out.println(collection.isEmpty());//判断集合是否为空
        System.out.println(collection.size());//集合个数
        collection.clear();//清空集合

        Collection<Point> collection1 = new ArrayList<>();
        collection1.add(new Point(1, 2));
        collection1.add(new Point(2, 2));
        collection1.add(new Point(3, 2));
        collection1.add(new Point(4, 2));
        System.out.println(collection1);

        Point point = new Point(1,2);

        System.out.println(collection1.contains(point));//看集合是否包含
    }
}
