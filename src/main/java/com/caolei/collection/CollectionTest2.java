package com.caolei.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("java");
        collection.add(".net");
        collection.add("c");

        Collection collection1 = new ArrayList();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add("java");

        /*collection.addAll(collection1);
        System.out.println(collection);*/

        /*collection.retainAll(collection1);//保留与共有的元素，1不受影响
        System.out.println(collection);
        System.out.println(collection1);*/

        collection.removeAll(collection1);//删除共有元素 1不受影响
        System.out.println(collection);
        System.out.println(collection1);

        collection1.remove("java");//删除一个

        System.out.println(collection1.containsAll(collection));//看是否包含全部
    }
}
