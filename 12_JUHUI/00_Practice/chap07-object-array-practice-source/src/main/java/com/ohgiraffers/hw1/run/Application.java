package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

    public static void main(String[] args) {

        // 객체 배열 생성
        EmployeeDTO[] employee = new EmployeeDTO[3];

        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        employee[0] = new EmployeeDTO();
        employee[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
        employee[2] = new EmployeeDTO( 2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        System.out.println("emp[0] : " + employee[0].information());
        System.out.println("emp[1] : " + employee[1].information());
        System.out.println("emp[2] : " + employee[2].information());

        System.out.println("==================================================================");

        // 첫 번째 직원의 빈 필드에 값 설정
        employee[0].setEmpNo(0);
        employee[0].setEmpName("김말똥");
        employee[0].setDept("영업부");
        employee[0].setJob("팀장");
        employee[0].setAge(30);
        employee[0].setGender('M');
        employee[0].setSalary(3000000);
        employee[0].setBonusPoints(0.2);
        employee[0].setPhone("01055559999");
        employee[0].setAddress(" 전라도 광주");

        // 두 번째 직원의 빈 필드에 값 설정
        employee[1].setDept("기획부");
        employee[1].setJob("부장");
        employee[1].setSalary(4000000);
        employee[1].setBonusPoints(0.3);

        // 출력
        System.out.println("emp[0] : " + employee[0].information());
        System.out.println("emp[1] : " + employee[1].information());

        System.out.println("==================================================================");

        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        System.out.println("김말똥의 연봉 : " + employee[0].calcSalary() + "원");
        System.out.println("홍길동의 연봉 : " + employee[1].calcSalary() + "원");
        System.out.println("강말순의 연봉 : " + employee[2].calcSalary() + "원");

        System.out.println("==================================================================");

        // 연봉 합계 계산
        int totalSalary = 0;
        for (EmployeeDTO emp : employee) {
            int annualSalary = emp.calcSalary();
            totalSalary += annualSalary;
        }

        // 평균 연봉 계산
        double averageSalary = totalSalary / employee.length;

        // 3명의 직원의 연봉 평균을 구하여 출력
        System.out.println("직원들의 연봉의 평균 : " + (int)averageSalary + "원");


    }
}
