package com.caolei.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转数组
 */
public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        collection.add("javaee");
        collection.add("python");
        //集合转数组
        String[] array = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
