package com.caolei.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
        int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
        return len1 - len2;
    }
}