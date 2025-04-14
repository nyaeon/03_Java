package com.ohgiraffers.section02.assertj;

public class Member {

    private int swquence;
    private String id;
    private String name;
    private int age;

    public Member(int swquence, String id, String name, int age) {
        this.swquence = swquence;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getSwquence() {
        return swquence;
    }

    public void setSwquence(int swquence) {
        this.swquence = swquence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Member{" +
                "swquence=" + swquence +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
