package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {}

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //getter
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

    //setter
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

    public String information() {
        return  "name = " + name + ", "
                + "age = " + age + ", "
                + "height = " + height + ", "
                + "weight = " + weight;
    }
}
