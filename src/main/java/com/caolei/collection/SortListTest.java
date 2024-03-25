package com.caolei.collection;

import java.util.ArrayList;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(146,245));
        list.add(new Point(23, 32));
        list.add(new Point(346, 452));
        list.add(new Point(44, 525));
        System.out.println(list);

        list.sort((o1, o2) -> o1.getX() * o1.getX() + o1.getY() * o1.getY()-o2.getX() * o2.getX() + o2.getY() * o2.getY());
        System.out.println(list);
    }
}
