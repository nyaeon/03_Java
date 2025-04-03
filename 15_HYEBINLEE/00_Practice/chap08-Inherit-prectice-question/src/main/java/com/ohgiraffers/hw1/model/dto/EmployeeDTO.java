package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

  int salary;
  String dept;

  public EmployeeDTO() {
  }

  public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
    this.setName(name);
    this.setAge(age);
    this.setHeight(height);
    this.setWeight(weight);
    this.setSalary(salary);
    this.setDept(dept);
  }

  @Override
  public String information(){
    return super.information()+String.format(", salary=%d, dept=%s", salary, dept);
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
}
