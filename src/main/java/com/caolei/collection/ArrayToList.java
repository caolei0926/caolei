package com.caolei.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //定义一个数组转换成集合
        String[] arr = {"a","b","c"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        list.set(0,"d");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        arr[0] = "e";
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //创建一个集合，把list集合复制进去
        List<String> list1 =new ArrayList<>(list);
        list1.add("f");
        System.out.println(list1);
    }
}
