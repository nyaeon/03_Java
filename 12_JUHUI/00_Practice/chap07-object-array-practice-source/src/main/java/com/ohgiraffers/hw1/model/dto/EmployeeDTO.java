package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO {

    private int empNo; // 사번
    private String empName; // 사원명
    private String dept; // 소속부서
    private String job; // 직급
    private int age; // 나이
    private char gender; // 성별
    private int salary; // 급여
    private double bonusPoints; // 보너스포인트
    private String phone; // 전화번호
    private String address; // 주소

    public EmployeeDTO() {}

    public EmployeeDTO(int empNo, String empName, int age, char gender, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public EmployeeDTO(int empNo, String empName, String dept, String job
            , int age, char gender, int salary, double bonusPoints, String phone
            , String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoints = bonusPoints;
        this.phone = phone;
        this.address = address;
    }

    // 연봉 계산 메소드 (보너스 포함)
    public int calcSalary() {
        return (int)(salary + (salary * bonusPoints)) * 12;
    }

    // 실행결과 화면을 만들기 위한 메소드라고 생각하면 됨.
    public String information(){
        return this.empNo + ", "
                + this.empName + ", "
                + this.dept + ", "
                + this.job + ", "
                + this.age + ", "
                + this.gender + ", "
                + this.salary + ", "
                + this.bonusPoints + ", "
                + this.phone + ", "
                + this.address;
    }

    // setter로 값 넣기
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusPoints(double bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //getter

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
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

    public int getSalary() {
        return salary;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "사번: " + empNo + ", 이름: " + empName + ", 부서: " + dept + ", 직급: " + job +
                ", 나이: " + age + ", 성별: " + gender + ", 급여: " + salary +
                ", 보너스포인트: " + bonusPoints + ", 전화번호: " + phone + ", 주소: " + address;
    }
}
