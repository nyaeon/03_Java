package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO {

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoints;
    private String phone;
    private String adress;

    public EmployeeDTO() {}

    public EmployeeDTO(int empNo, String empName, int age, char gender, int salary, String phone, String adress) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.phone = phone;
        this.adress = adress;
    }

    public EmployeeDTO(int empNo, String empName, String dept, String job,
                       int age, char gender, int salary, double bonusPoints, String phone, String adress) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoints = bonusPoints;
        this.phone = phone;
        this.adress = adress;
    }

    public String information () {
        return "Employee No: " + empNo
                + " Employee Name: " + empName
                + " Department: " + dept
                + " Job: " + job
                + " Age: " + age
                + " Gender: " + gender
                + " Salary: " + salary
                + " Bonus Points: " + bonusPoints
                + " Phone: " + phone
                + " Adress: " + adress;
    }

    public double sumsalary () {
        return (salary + (salary * bonusPoints)) * 12;
    }
    public double sumsalary1 () {
        return (salary  * 12);
    }



}
