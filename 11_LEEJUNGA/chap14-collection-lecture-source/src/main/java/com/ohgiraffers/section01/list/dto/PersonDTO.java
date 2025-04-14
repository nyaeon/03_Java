package com.ohgiraffers.section01.list.dto;

public class PersonDTO {
    private String name;
    private int age;

    public PersonDTO() {
    }

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
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
}
