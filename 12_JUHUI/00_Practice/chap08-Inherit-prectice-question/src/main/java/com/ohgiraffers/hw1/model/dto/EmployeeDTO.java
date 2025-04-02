package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    public int salary; // 급여
    private String dept; // 부서

    public EmployeeDTO() {}

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String information() {
        return super.information() + ", " // 부모클래스의 information() 메소드를 활용하는 방법
                + "salary = " + salary + ", "
                + "dept = " + dept;
    }

    //getter
    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    //setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
