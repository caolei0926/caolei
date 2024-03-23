package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(123);
        System.out.println(collection);
        System.out.println(collection.isEmpty());
    }
}
