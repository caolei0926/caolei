package com.caolei.io;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Person implements Serializable{
    private String name;
    private int age;
    private boolean sex;
    private String[] other;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", other=" + Arrays.toString(other) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && sex == person.sex && Objects.equals(name, person.name) && Arrays.equals(other, person.other);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, sex);
        result = 31 * result + Arrays.hashCode(other);
        return result;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String[] getOther() {
        return other;
    }

    public void setOther(String[] other) {
        this.other = other;
    }

    public Person(String name, int age, boolean sex, String[] other) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("caolei",18);
        System.out.println(person);
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}
