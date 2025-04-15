package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary; // 급여
    private String dept;    // 부서

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        this.salary = salary;
        this.dept = dept;
        super.name = name;
    }

    public int getSalary(int salary) {
        return salary;
    }

    public String getDept(String dept) {
        return dept;
    }

    public int setSalary(int salary) {
        return salary;
    }

    public String setDept(String dept) {
        return dept;
    }

    @Override
    public String information() {
//        return "이름: " + super.getName() + ", 나이: " + super.getAge() +
//                ", 신장: " + super.getHeight() + ", 몸무게: " + super.getWeight() +
//                ", 급여: " + salary + ", 부서: " + dept;
        return super.information()
                + "급여: " + salary + ", 부서: " + dept;
    }

}
