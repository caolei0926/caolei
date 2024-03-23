package com.caolei.object_se;

public class PointDemo {

    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point);
        Point point1 = new Point(1, 2);
        System.out.println(point1.equals(point));

        int iMax = Integer.MAX_VALUE;
        int iMin = Integer.MIN_VALUE;
        System.out.println(iMax);
        System.out.println(iMin);

        double dMax = Double.MAX_VALUE;  // Double.MAX_VALUE 表示 Double 类型数据的最大值
        double dMin = Double.MIN_VALUE;  // Double.MIN_VALUE 表示 Double 类型数据的最小值

        System.out.println(dMax);  // 输出 Double.MAX_VALUE
        System.out.println(dMin);  // 输出 Double

        // 定义一个 float 类型的最大值常量
        float fMax = Float.MAX_VALUE;
        // 定义一个 float 类型的最小值常量
        float fMin = Float.MIN_VALUE;

        // 输出最大值和最小值
        System.out.println(fMax);
        System.out.println(fMin);
    }
}
