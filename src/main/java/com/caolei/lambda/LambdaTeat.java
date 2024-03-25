package com.caolei.lambda;

import java.util.Comparator;

public class LambdaTeat {
    public static void main(String[] args) {
        Comparator<String> c1 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
        Comparator<String> c2 = (String o1,String o2)->o2.length()-o1.length();
    }
}
