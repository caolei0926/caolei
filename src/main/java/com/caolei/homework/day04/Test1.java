package com.caolei.homework.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 在一个List集合中生成20个随机整数(100以内)
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 *
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add((int) (Math.random() * 100));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.subList(5, 16));
        Collections.reverse(list.subList(5, 16));
        list.sort((o1, o2) -> o2 - o1);

        /*List <Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add((int) (Math.random()*100));
        }
        Collections.sort(list);
        //System.out.println(list);
        //取集合第六个到第十六个元素
        list.subList(5, 16);
        //从大到小排序集合
        list.sort(Collections.reverseOrder());
        System.out.println(list);*/
    }
}
