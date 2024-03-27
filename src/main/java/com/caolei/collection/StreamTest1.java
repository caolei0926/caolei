package com.caolei.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        Random  random = new Random();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0,100));
        }
        //list.forEach(System.out::println);
        List<Integer> collect = list.stream().map(x -> x * 3).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collect);
        //获取list集合中所有的偶数
        List<Integer> collect1 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(collect1);

    }
}
