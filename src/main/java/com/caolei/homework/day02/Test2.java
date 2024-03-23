package com.caolei.homework.day02;
/**
 * 拆分字符串练习
 * 背景介绍:
 * 上网的时候,浏览器地址栏上有没有留意类似如下的地址形式?
 * https://search.jd.com/Search?keyword=usb&enc=utf-8&wq=usb&pvid=2fb014e3597c4712828926e2f35fa2b5
 * 上面这样的地址称为:URL(什么是URL可以百度一下~)
 * SE后期我们要写一个服务端,就要处理浏览器这样的请求.今天学习的字符串拆分方法在这里意义重大!
 */
public class Test2 {
    public static void main(String[] args) {
        String url = "https://search.jd.com/Search?keyword=usb&enc=utf-8&wq=usb&pvid=2fb014e3597c4712828926e2f35fa2b5";
        String[] split = url.split("&");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
