package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salry;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salry, String dept) {
        super(name, age, height, weight);
        this.salry = salry;
        this.dept = dept;
    }

    public int getSalry() {
        return salry;
    }

    public void setSalry(int salry) {
        this.salry = salry;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String infomation() {
        return "name : " + name + ", " + "age : " + age + ", "
                + "height : " + height + ", " + "weight : " + weight + "salary : "
                + salry + ", " + "dept : " + dept;
    }
}
