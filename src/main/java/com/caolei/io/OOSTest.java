package com.caolei.io;

import java.io.*;

public class OOSTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String name = "caolei";
        int age = 18;
        boolean  sex = true;
        String[] other = {"高","富","帅"};
        Person person = new Person(name,age,sex,other);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();

        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
