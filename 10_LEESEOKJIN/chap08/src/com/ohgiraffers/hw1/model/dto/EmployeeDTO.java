package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

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

    public EmployeeDTO() {}
    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        setName(name);
        setSalary(salary);
        setDept(dept);
    }

    @Override
    public String information() {
        return super.information() + ", Salary: " + salary + ", Department: " + dept;
    }
}
