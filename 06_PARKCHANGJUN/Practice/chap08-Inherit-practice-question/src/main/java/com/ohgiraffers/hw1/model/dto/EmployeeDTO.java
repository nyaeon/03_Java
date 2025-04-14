package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    private int salary;     // 급여
    private String dept;    //부서

    // 기본 생성자
    public EmployeeDTO() {
    }

    // 매개변수 생성자
    // name 값은 부모 필드 값에 직접 접근해서 초기화
    // age, height, weight는 부모 생성자를 통해 초기화
    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String information() {
        return "salary: " + salary + ", dept: " + dept;
    }
}

