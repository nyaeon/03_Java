package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double weight;
    private double height;

    public PersonDTO() {}

    public PersonDTO(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String information(){
        return " 이름 : " + name
                + " 나이 : " + age
                + " 신장 : " + height
                + " 몸무게 : " + weight;
    }
}
