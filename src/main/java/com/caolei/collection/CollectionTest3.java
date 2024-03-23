package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest3 {
    public static void main(String[] args) {
        Collection<Point> collection= new ArrayList<>();
        Point p1=new Point(1,2);

        collection.add(p1);
        System.out.println(p1);
        System.out.println("数组"+collection);

        p1.setX(2);
        System.out.println(p1);
        System.out.println("数组"+collection);


    }
}
