package com.alibaba.cloud.examples.entity;

/**
 * Created by Administrator on 2021/2/7 0007.
 */
public class User {

    private String name;

    private int age;

    private String hr;

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

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hr='" + hr + '\'' +
                '}';
    }
}
