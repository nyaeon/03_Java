package com.greedy.level01.basic.member.model.dto;

public class EmployeeDTO {
    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salarly;
    private double bounsPoint;
    private String phone;
    private String address;

    public EmployeeDTO() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalarly() {
        return salarly;
    }

    public void setSalarly(int salarly) {
        this.salarly = salarly;
    }

    public double getBounsPoint() {
        return bounsPoint;
    }

    public void setBounsPoint(double bounsPoint) {
        this.bounsPoint = bounsPoint;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
