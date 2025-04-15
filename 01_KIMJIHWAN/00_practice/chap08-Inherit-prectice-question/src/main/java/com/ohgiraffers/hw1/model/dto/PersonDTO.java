package com.ohgiraffers.hw1.model.dto;

import com.ohgiraffers.hw1.run.Application;

public class PersonDTO {
    protected String name;  // 이름
    private int age;        // 나이
    private double height;  // 신장
    private double weight;  // 몸무게

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String information(){
        return "이름: " + this.name + ", 나이: " + age + ", 신장: " + height + ", 몸무게: " + weight;
    }
}
