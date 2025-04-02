package com.ohgiraffers.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
    private int salary;
    private String dept;

    public EmployeeDTO() {
    }


    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String information() {
        return super.information() + ", salary=" + salary + ", dept=" + dept;
    }

//    > Task :com. ohgiraffers.hw1.run. Application.main()
//    name=홍길동, age=20, height=178.2, weight=70.0, grade=1, major=정보시스템공학과
//    name=김말똥, age=21, height=187.3, weight=80.0, grade=2, major=경영학과
//    name=강개순, age=23, height=167.0, weight=45.0, grade=4, major=정보통신공학과
//    이름 : 유관순
//    나이 : 16
//    키 : 159.9
//    몸무게 : 45.5
//    급여 : 100000000
//    부서 : 영업1팀

//    계속 입력하시겠습니까? (y/n) : y

//    이름 : 강감찬
//    나이 : 35
//    키 : 182.0
//    몸무게 : 70
//    급여 : 40000000
//    부서 : 기획부
//    계속 입력하시겠습니까? (y/n) : n


//   name=유관순, age=16, height=159.9, weight=45.5, salary=100000000, dept=영업1팀
//   name=강감찬, age=35, height=182.0, weight=70.0, salary=40000000, dept=기획부
}
