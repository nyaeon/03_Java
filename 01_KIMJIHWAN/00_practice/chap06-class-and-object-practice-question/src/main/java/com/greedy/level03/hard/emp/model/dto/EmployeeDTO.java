package com.greedy.level03.hard.emp.model.dto;

public class EmployeeDTO {
    private int number;
    private String name;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private double salary;
    private double bonuspoint;
    private String phone;
    private String address;

    public EmployeeDTO() {}



    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonuspoint() {
        return bonuspoint;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonuspoint(double bonuspoint) {
        this.bonuspoint = bonuspoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
